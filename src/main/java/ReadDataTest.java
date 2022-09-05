import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadDataTest {
    ArrayList<Figure> figureArrayList = new ArrayList<>();
    ReadData readData = new ReadData();
    @Test
    void testReadFromFile(){
        File myFile;
        try{
            myFile = new File("testFile.txt");
            if (!myFile.createNewFile()) {
                System.out.println("The file already exists.");
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        readData.readFromFile(myFile.getName(), figureArrayList);
        assertEquals(3, figureArrayList.size(), "Reading from file is wrong!");
    }
    @Test
    void testReadFromConsole() throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        final int members = 3;
        readData.readFromTheConsole(figureArrayList,members);
        assertEquals(members, figureArrayList.size(), "Reading from console is wrong!");
    }
}
