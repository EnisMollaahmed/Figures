import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCircle {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 15})
    public void testPerimeter(int number){
        Circle circle1 = new Circle(number);
        assert(circle1.perimeter() == number * Math.PI * circle1.getRadius());
    }
    @Test
    public void testClone(){
        Figure circle1 = new Circle(1);
        Figure circle2 = circle1.clone();
        assert (circle1.equals(circle2));
    }
    @Test
    public void testToString(){
        Circle circle = new Circle(5);
        assert(circle.toString().equals("Circle: radius: 5"));
    }
}
