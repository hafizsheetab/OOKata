public class ShapeList {
   private double[] size;
   private String[] type;
   private  int numberOfShapes;
   private Shape [] shape;

    public ShapeList(double[] size, String[] type) {
       this.size = size;
       this.type = type;
       this.numberOfShapes = size.length;
       this.shape =setShapes();

    }

    private Shape[] setShapes() {
        Shape[] shape = new Shape[numberOfShapes];
        for(int i=0;i<numberOfShapes;i++){
            shape[i] = getShapeType(type[i]);
            shape[i].setSize(size[i]);
        }
        return shape;
    }

    private static Shape getShapeType(String type){
        if(type.equals("square")){
            return new Square();
        }
        else{
            return new Circle();
        }
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            total += shape[i].area();
        }
        return total;
    }

    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            total += shape[i].perimeter();
        }
        return total;
    }

}

