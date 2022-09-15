package Figures;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Rectangle implements Figure{
    private @Getter @Setter double length;
    private @Getter @Setter double width;
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(String values){
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
    @Override
    public boolean equals(Object other){
        Rectangle otherRect = (Rectangle)other;
        boolean result = false;
        if(otherRect != null){
            result = (this.length == otherRect.getLength()) && (this.width == otherRect.getWidth());
        }
        return result;
    }
}
