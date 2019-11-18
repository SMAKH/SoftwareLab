import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRectangleArea {
    @Test
    public void testRectangleArea() {
        Area2D rectangle = new Rectangle(2d, 5d);
        assertEquals(calculateArea(rectangle), 10d);
    }

    @Test
    public void testSquareArea() {
        Area2D square = new Square(8d);
        assertEquals(calculateArea(square), 64d);
    }


    @Test
    public void testChangingRectangleArea() {
        Area2D narrowRectangle = new Rectangle(0.1d, 10.1d);
        assertEquals(calculateArea(narrowRectangle), 1.01d);

        narrowRectangle.setLength(0.2d);
        narrowRectangle.setWidth(4d);
        assertEquals(calculateArea(narrowRectangle), 0.8d);
    }

    @Test
    public void testChangingSquareArea() {
        Area2D square = new Square(3d);
        assertEquals(calculateArea(square), 9d);

        square.setLength(2d);
        assertEquals(calculateArea(square), 4d);
    }


    private double calculateArea(Area2D area) {
        return area.getArea();
    }
}