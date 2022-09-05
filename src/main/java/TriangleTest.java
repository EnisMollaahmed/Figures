import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TriangleTest {
    @BeforeEach
    Triangle setTriangle(){
        return new Triangle("16 20 23");
    }
    @Test
    void testPerimeter(){
        assertEquals(59, setTriangle().perimeter(), 0.01);
    }
    @Test
    void testToString(){
        Class cls = setTriangle().getClass();
        assertEquals(cls.getSimpleName() + " side A: " + setTriangle().getSideA() + " side B: " + setTriangle().getSideB()
                + " side C: " + setTriangle().getSideC(), setTriangle().toString(), "There is something wrong in triangle's toString method");
    }
    @Test
    void testClone(){
        Triangle triangle2 = (Triangle) setTriangle().clone();
    }
}
