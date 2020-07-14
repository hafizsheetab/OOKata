public class ShapeList {
   private double[] sizes;
   private String[] types;
   private  int numberOfShapes;
   private Shape [] shapes;

    public ShapeList(double[] sizes, String[] types) {
       this.sizes = sizes;
       this.types = types;
       this.numberOfShapes = sizes.length;
       this.shapes=setShapes(sizes,types);

    }

    private Shape[] setShapes(double[] sizes, String[] types) {
        Shape[] shape = new Shape[numberOfShapes];
        for(int i=0;i<numberOfShapes;i++){
            shape[i] = getShapeType(types[i]);
            shape[i].setSize(sizes[i]);
        }
        return shape;
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

    private static Shape getShapeType(String type){
        if(type.equals("square")){
            return new Square();
        }
        else{
            return new Circle();
        }
    }


}

