package Factory;

import Figures.Figure;
import StringFormatting.ExtractString;
import StringFormatting.FormatTheString;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FigureFactory {
    public static Figure create(String figureName, String values) throws ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException
    {
        Class<?> fig = Class.forName("Figures." + figureName);
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
