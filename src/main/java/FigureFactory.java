import java.lang.reflect.*;
public class FigureFactory {
    public static Figure create(String figureName, String values) throws ClassNotFoundException,
                                                                         NoSuchMethodException,
                                                                         InvocationTargetException,
                                                                         InstantiationException,
                                                                         IllegalAccessException
    {
        Class<?> fig = Class.forName(figureName);
        Constructor<?> constructor = fig.getConstructor(String.class);
        return (Figure) constructor.newInstance(values);
    }

    public static Figure create(String figureInfo) throws   ClassNotFoundException,
                                                            NoSuchMethodException,
                                                            InvocationTargetException,
                                                            InstantiationException,
                                                            IllegalAccessException
    {
        String extractFigureName = ExtractString.extractFigureName(figureInfo);
        extractFigureName = FormatTheString.capitalize(extractFigureName);
        return FigureFactory.create(extractFigureName, ExtractString.extractNumbers(figureInfo));
    }
}
