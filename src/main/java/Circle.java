import java.lang.Math;
public class Circle implements Figure{
    private double radius;
    public void setRadius(double radius1){
        radius = radius1;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
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
}
