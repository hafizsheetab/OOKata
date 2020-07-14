public class ShapeList {
    private DataOfShapes [] dataOfShapes;

    public ShapeList(double[] sizes, String[] types) {
         DataOfShapes[] dataOfShapes = new DataOfShapes[sizes.length] ;
         dataOfShapes = assignSizeAndType(sizes,types,dataOfShapes);
         this.dataOfShapes=dataOfShapes;

    }
    public double totalArea() {
        double total = 0;
        Shape shape;
        for (int i = 0; i < dataOfShapes.length; i++) {
            shape = shapeType(dataOfShapes[i]);
            total += shape.area();
        }

        return total;
    }

    public double totalPerimeter() {

        double total = 0;
        Shape shape;
        for (int i = 0; i < dataOfShapes.length; i++) {
            shape = shapeType(dataOfShapes[i]);
            total += shape.perimeter();
        }

        return total;
    }

    private static Shape shapeType(DataOfShapes dataOfShape) {
        if(dataOfShape.getType()=="square"){
            return new Square(dataOfShape.getSize());
        }
        else{
            return new Circle(dataOfShape.getSize());
        }
    }
    private static DataOfShapes[] assignSizeAndType(double[] sizes,String [] types,DataOfShapes[] dataOfShapes){
        for(int i=0;i<sizes.length;i++){
            dataOfShapes[i] = new DataOfShapes(sizes[i],types[i]);
        }
        return dataOfShapes;
    }


}

