export interface TableColumnConfig<TData> {
    headerHtml: string;
    resolveHtml: (rowData: TData, index?: number) => JQuery;
    compare?: (a: TData, b: TData) => number;
}
