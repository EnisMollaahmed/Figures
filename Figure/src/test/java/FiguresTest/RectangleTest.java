package FiguresTest;

import Figures.Figure;
import Figures.Rectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @ParameterizedTest
    @CsvSource(value = {"5:5", "12:7", "8:6"}, delimiter = ':')
    void testPerimeter(double length, double width){
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(2 * (length + width), rectangle.perimeter(), 0.000001);
    }
    @ParameterizedTest
    @CsvSource(value = {"5:5", "12:7", "8:6"}, delimiter = ':')
    void testToString(double length, double width){
        Rectangle rectangle = new Rectangle(length, width);
        Class cls = rectangle.getClass();
        assertEquals(cls.getSimpleName() + ": length: " + rectangle.getLength() + " width: " + rectangle.getWidth(), rectangle.toString());
    }
    @Test
    void testClone(){
        Figure rectangle = new Rectangle(5, 3);
        Figure rectangle1 = rectangle.clone();
        assert(rectangle1.equals(rectangle));
    }
}
