import 'node-fetch';
import { Problem, Author } from "./models/Problem";
import { map, uniqBy, find } from 'lodash';
import { Issue } from './models/Issue';

class Database {
    public problems: Problem[];
    public authors: Author[];

    async load(): Promise<void> {
        return fetch("https://api.github.com/repos/iut-cse/oo-problem-catalog/issues", {
            headers: {
                "Accept": "*/*,application/vnd.github.squirrel-girl-preview"
            }
        }).then(res => res.json()
        ).then(issues => {
            this.process(issues);
        }).catch(error => {
            console.log(error);
        });
    }

    private process(rawIssues: Issue[]) {
        let rawAuthors = map(rawIssues, ri => ri.user);
        rawAuthors = uniqBy(rawAuthors, ra => ra.login);
        this.authors = map(rawAuthors, ra=>new Author(ra));


        this.problems = map(rawIssues, ri => {
            let problem = new Problem(ri);
            problem.author = find(this.authors, author => author.handle === ri.user.login);
            problem.author.problems.push(problem);

            return problem;
        });
    }
}

export const database = new Database();