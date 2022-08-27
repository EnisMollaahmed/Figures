import java.util.Scanner;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    @Override
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    Triangle(String values){
        Scanner scanner = new Scanner(values);
        sideA = Double.parseDouble(scanner.next());
        sideB = Double.parseDouble(scanner.next());
        sideC = Double.parseDouble(scanner.next());
    }
    Triangle(double A, double B, double C){
        sideA = A;
        sideB = B;
        sideC = C;
    }
    Triangle(Triangle target){
        if(target != null){
            this.sideA = target.sideA;
            this.sideB = target.sideB;
            this.sideC = target.sideC;
        }
    }
    @Override
    public Figure clone(){
        return new Triangle(this);
    }
    @Override
    public String toString(){
        Class cl = getClass();
        return cl.getSimpleName() + ": side A: " + this.sideA + " side B: " + this.sideB + " side C: " + this.sideC;
    }
}
