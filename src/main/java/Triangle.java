public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    @Override
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    Triangle(double A, double B, double C){
        sideA = A;
        sideB = B;
        sideC = C;
    }
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double SideB){
        this.sideB = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
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
}
