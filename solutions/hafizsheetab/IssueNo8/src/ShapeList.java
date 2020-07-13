public class ShapeList {
    private DataOfShapes dataOfShapes;

    public ShapeList(double[] sizes, String[] types) {
        dataOfShapes = new DataOfShapes(types,sizes);
    }
    public double totalArea() {
        double total = 0;
        Shape shape;
        for (int index = 0; index < dataOfShapes.numberOfShapes(); index++) {
            shape = shapeType(dataOfShapes,index);
            total += shape.area();
        }

        return total;
    }

    public double totalPerimeter() {

        double total = 0;
        Shape shape;
        for (int index = 0; index < dataOfShapes.numberOfShapes(); index++) {
            shape = shapeType(dataOfShapes,index);
            total += shape.perimeter();
        }

        return total;
    }

    private static Shape shapeType(DataOfShapes dataOfShape, int index) {
        if(dataOfShape.getType(index)=="square"){
            return new Square(dataOfShape.getSize(index));
        }
        else{
            return new Circle(dataOfShape.getSize(index));
        }
    }


}

