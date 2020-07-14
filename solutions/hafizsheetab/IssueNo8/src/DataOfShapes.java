import java.lang.reflect.Array;

public class DataOfShapes {
    private String  type;
    private double  size;

    public DataOfShapes(double size,String type) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }
}
