package ReadDataTestAndCreateRandomTest;

import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Triangle;
import ReadInfoAndCreateRandom.ReadData;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadDataTest {
    ArrayList<Figure> figureArrayList = new ArrayList<>();
    ReadData readData = new ReadData();
    @Test
    void testReadFromFile2() {
        File myFile = new File("testFile.txt");
        readData.readFromFile(myFile.getName(), figureArrayList);
        Figure[] expected = {
                new Circle(10),
                new Rectangle(5, 6),
                new Triangle(3, 4, 5)
        };

        for(int i = 0 ; i < expected.length; ++i) {
            assertEquals(
                    figureArrayList.get(i).toString(),
                    expected[i].toString()
            );
        }
    }

    @Test
    void testReadFromConsole() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        final int members = 3;
        readData.readFromTheConsole(figureArrayList,members);
        assertEquals(members, figureArrayList.size(), "Reading from console is wrong!");
    }
}
