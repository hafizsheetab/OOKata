import java.lang.reflect.Array;

public class DataOfShapes {
    private String [] types;
    private double [] sizes;

    public DataOfShapes(String[] types, double[] sizes) {
        this.types = types;
        this.sizes = sizes;
    }

    public String getType(int index) {
        return types[index];
    }

    public double getSize(int index) {
        return sizes[index];
    }
    public int numberOfShapes(){

        return types.length;
    }

}
