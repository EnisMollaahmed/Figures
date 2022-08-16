public class CreateFigure {
    private static CreateFigure instance;
    private CreateFigure(){}
    public static CreateFigure getInstance(){
        if (instance == null){
            instance = new CreateFigure();
        }
        return instance;
    }
    public Triangle createTriangle(double Aside, double Bside, double Cside){
        return new Triangle(Aside, Bside, Cside);
    }
    public Circle createCircle(double rad){
        return new Circle(rad);
    }
    public Rectangle createRectangle(double length, double width){
        return new Rectangle(length, width);
    }
}
