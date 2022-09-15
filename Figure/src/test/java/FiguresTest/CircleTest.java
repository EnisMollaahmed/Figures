package FiguresTest;

import Figures.Circle;
import Figures.Figure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 15})
    public void testPerimeter(int number){
        Circle circle1 = new Circle(number);
        assertEquals(2 * Math.PI * circle1.getRadius(),circle1.perimeter());
    }
    @Test
    public void testClone(){
        Figure circle1 = new Circle(1);
        Figure circle2 = circle1.clone();
        assertTrue (circle1.equals(circle2));
    }
    @Test
    public void testToString(){
        Circle circle = new Circle(5);
        Class cls = circle.getClass();

        assert(circle.toString().equals( cls.getSimpleName() + ": radius: " + circle.getRadius()));
    }
}
