package FiguresTest;

import Figures.Figure;
import Figures.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void testPerimeter(){
        Figure triangle = new Triangle("16 20 23");
        assertEquals(59, triangle.perimeter(), 0.01);
    }
    @Test
    void testToString(){
        Triangle triangle = new Triangle("16 20 23");
        Class cls = triangle.getClass();
        assertEquals(cls.getSimpleName() + ": side A: " + triangle.getSideA() + " side B: " + triangle.getSideB()
                + " side C: " + triangle.getSideC(), triangle.toString(), "There is something wrong in triangle's toString method");
    }
    @Test
    void testClone(){
        Figure triangle1 = new Triangle("16 20 23");
        Figure triangle2 = triangle1.clone();
        assertEquals(triangle1, triangle2);
    }
}
