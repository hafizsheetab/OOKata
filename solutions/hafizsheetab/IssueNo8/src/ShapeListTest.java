
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ShapeListTest {
    @Test
    public void testAll(){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square();
        shapes[0].setSize(10);
        shapes[1] = new Square();
        shapes[1].setSize(5);
        shapes[2] = new Circle();
        shapes[2].setSize(1);
        ShapeList shapeList = new ShapeList(shapes);

        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.totalArea());
    }
}
