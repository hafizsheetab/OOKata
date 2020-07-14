public class Circle implements Shape {
    private double size;
    private double pi=3.1416;
    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double perimeter() {
        return 2*pi*size;
    }

    @Override
    public double area() {
        return pi*size*size;
    }
}
