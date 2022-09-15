package Controller;

import Figures.Figure;
import ReadInfoAndCreateRandom.CreateRandom;
import ReadInfoAndCreateRandom.ReadData;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void console(ArrayList<Figure> figuresArr, Scanner sc, ReadData readData, CreateRandom createRandom) throws Exception {
        String command = sc.nextLine();
        command = command.toLowerCase();
        while(!command.equals("end")){
            switch (command) {
                case "read from console", "create random" -> {
                    int figCount = Integer.parseInt(sc.nextLine());
                    if (command.equals("create random")) {
                        createRandom.createRandomFigures(figuresArr, figCount);
                    } else {
                        readData.readFromTheConsole(figuresArr, figCount);
                    }
                }
                case "read from file" -> {
                    String filename = sc.nextLine();
                    readData.readFromFile(filename, figuresArr);
                }
                case "delete an element", "element info" -> {
                    int elementIndex;
                    do {
                        elementIndex = Integer.parseInt(sc.nextLine());
                    } while (elementIndex >= 0 && elementIndex < figuresArr.size());
                    figuresArr.remove(elementIndex);
                    if (command.equals("element info")) {
                        System.out.println(figuresArr.get(elementIndex).toString());
                        System.out.println(figuresArr.get(elementIndex).perimeter());
                    }
                }
                case "delete all figures" -> figuresArr.clear();
            }
        }
    }
}
