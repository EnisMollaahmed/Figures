import java.lang.reflect.*;
public class CreateFigure {
    public Figure CreateOneFigure(String figureName, String values) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String fullName = "Figures.src.main.java." + figureName;
        Class fig = Class.forName(fullName);
        Constructor constructor = fig.getConstructor(String.class);
        Figure figure = null;

        switch (figureName){
            case "Triangle":
                figure = (Triangle)constructor.newInstance(values);
                break;
            case "Rectangle":
                figure = (Rectangle)constructor.newInstance(values);
                break;
            case "Circle":
                figure = (Circle)constructor.newInstance(values);
                break;
        }
        return figure;
    }
}
