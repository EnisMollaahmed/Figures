import java.lang.reflect.*;
public class FigureFactory {
    public static Figure create(String figureName, String values) throws ClassNotFoundException,
                                                                         NoSuchMethodException,
                                                                         InvocationTargetException,
                                                                         InstantiationException,
                                                                         IllegalAccessException {
        String fullName = "Figures.src.main.java." + figureName;
        Class fig = Class.forName(fullName);
        Constructor constructor = fig.getConstructor(String.class);
        Figure figure = constructor.newInstance(values);
        return figure;
    }

    public static Figure create(String figureInfo) throws   ClassNotFoundException,
                                                            NoSuchMethodException,
                                                            InvocationTargetException,
                                                            InstantiationException,
                                                            IllegalAccessException
    {
        String extractFigureName = ExtractString.extractFigureName(figureInfo);
        extractFigureName = FormatTheString.capitalize(extractFigureName);
        return FigureFactory.create(extractFigureName, extractString.extractNumbers(figureInfo));
    }
}
