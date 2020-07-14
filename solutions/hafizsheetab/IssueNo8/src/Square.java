public class Square implements Shape {
    private double size;

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        return size * size;
    }

    @Override
    public double perimeter() {
        return 4 * size;
    }
}
