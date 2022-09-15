package ReadInfoAndCreateRandom;

import Factory.FigureFactory;
import Figures.Figure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
    public void readFromFile(String fileName, ArrayList<Figure> figuresArr) {

        File myFile = new File(fileName);

        if ( ! myFile.exists()) {
            throw new IllegalArgumentException("Invalid file name or filepath!");
        }

        try {
            FileReader file = new FileReader(myFile.getAbsolutePath());
            BufferedReader buffReader = new BufferedReader(file);
            String line;

            while( (line = buffReader.readLine()) != null){
                figuresArr.add(FigureFactory.create(line));
            }

            buffReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void readFromTheConsole(ArrayList<Figure> figuresArr, int figCount) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < figCount; i++) {
            String line = scanner.nextLine();
            figuresArr.add(FigureFactory.create(line));
        }

        scanner.close();
    }
}
