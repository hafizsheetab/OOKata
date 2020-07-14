public class ShapeList {
   private double[] sizes;
   private String[] types;
   private  int numberOfShapes;

    public ShapeList(double[] sizes, String[] types) {
       this.sizes = sizes;
       this.types = types;
       this.numberOfShapes = sizes.length;

    }
    public double totalArea() {
        double total = 0;
        Shape shape;
        for (int i = 0; i < numberOfShapes; i++) {
            shape = getShape(types[i]);
            shape.setSize(sizes[i]);
            total += shape.area();
        }

        return total;
    }

    public double totalPerimeter() {

        double total = 0;
        Shape shape;
        for (int i = 0; i < numberOfShapes; i++) {
            shape = getShape(types[i]);
            shape.setSize(sizes[i]);
            total += shape.perimeter();
        }

        return total;
    }

    private static Shape getShape(String type){
        if(type=="square"){
            return new Square();
        }
        else{
            return new Circle();
        }
    }


}

