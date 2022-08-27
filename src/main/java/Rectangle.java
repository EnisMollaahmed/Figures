import java.util.Scanner;

public class Rectangle implements Figure{
    private double length;
    private double width;
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    Rectangle(double lngth, double wdth){
        length = lngth;
        width = wdth;
    }
    Rectangle(String values){
        Scanner scanner = new Scanner(values);
        length = Double.parseDouble(scanner.next());
        width = Double.parseDouble(scanner.next());
    }
    Rectangle(Rectangle target){
        if(target != null){
            this.length = target.length;
            this.width = target.width;
        }
    }
    @Override
    public Figure clone(){
        return new Rectangle(this);
    }
    @Override
    public String toString(){
        Class cl = getClass();
        return cl.getSimpleName() + ": length: " + this.length + " width: " + this.width;
    }
}
