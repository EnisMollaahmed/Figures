package Figures;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Triangle implements Figure{
    private @Getter @Setter double sideA;
    private @Getter @Setter double sideB;
    private @Getter @Setter double sideC;
    @Override
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    public Triangle(String values){
        Scanner scanner = new Scanner(values);
        sideA = Double.parseDouble(scanner.next());
        sideB = Double.parseDouble(scanner.next());
        sideC = Double.parseDouble(scanner.next());
    }
    public Triangle(double A, double B, double C){
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
    @Override
    public boolean equals(Object other){
        Triangle otherTriangle = (Triangle) other;
        boolean result = false;
        if(otherTriangle != null){
            result = (this.sideA == otherTriangle.getSideA()) &&
                     (this.sideB == otherTriangle.getSideB()) &&
                     (this.sideC == otherTriangle.getSideC());
        }
        return result;
    }
}
