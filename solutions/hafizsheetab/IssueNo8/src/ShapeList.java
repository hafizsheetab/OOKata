public class ShapeList {
   private  int numberOfShapes;
   private Shape [] shapes;

    public ShapeList(Shape [] shape) {
       this.numberOfShapes = shape.length;
       this.shapes =shape;

    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            total += shapes[i].area();
        }
        return total;
    }

    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            total += shapes[i].perimeter();
        }
        return total;
    }

}

