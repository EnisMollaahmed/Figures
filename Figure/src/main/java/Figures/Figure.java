package Figures;

public interface Figure {
    double perimeter();
    Figure clone();
    String toString();
    boolean equals(Object other);
}
