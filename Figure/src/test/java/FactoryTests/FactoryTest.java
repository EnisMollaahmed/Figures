package FactoryTests;

import Factory.FigureFactory;
import Figures.Figure;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {
    @ParameterizedTest
    @CsvSource(value = {"Rectangle: 10 12", "Triangle: 10 10 10", "Circle: 15"}, delimiter = ':')
    void createByTwoStringsTest(String figName, String values) throws ClassNotFoundException,
            InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException
    {
        Figure figure = FigureFactory.create(figName, values);
        Class<?> cls = Class.forName("Figures." + figName);
        Constructor<?> constructor= cls.getConstructor(String.class);
        Object object = constructor.newInstance(values);
        assertEquals(figure, object);
    }
}
