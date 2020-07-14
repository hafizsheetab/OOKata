
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ShapeListTest {
    @Test
    public void testAll(){
        ShapeList shapeList = new ShapeList(new double[]{10, 5, 1},new String[]{"square", "square", "circle"});
        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.totalArea());
    }
}
