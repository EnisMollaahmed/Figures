import java.lang.Math;
import java.util.Scanner;
public class Circle implements Figure{
    private double radius;
    private ExtractString extractString;
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    Circle(String values){
        Scanner scanner = new Scanner(values);
        radius = Double.parseDouble(scanner.next());
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(Circle target){
        if(target != null){
            this.radius = target.radius;
        }
    }
    @Override
    public Figure clone(){
        return new Circle(this);
    }
    @Override
    public String toString(){
        Class cl = getClass();
        return cl.getSimpleName() + ": radius: " + this.radius;
    }
}
