import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
public class Main {//TODO: RESEARCH GENERICS

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Figure> figuresArr = new ArrayList<Figure>();
        ReadData readData = ReadData.getInstance();
        CreateRandom createRandom = CreateRandom.getInstance();
        String command = sc.nextLine();
        command = command.toLowerCase();
        while(!command.equals("end")){
            switch(command){
                case "read from console":
                case "create random":
                    int figCount = Integer.parseInt(sc.nextLine());
                    if(command.equals("create random")){
                        createRandom.createRandomFigures(figuresArr,figCount);
                    }
                    else{
                        readData.readFromTheConsole(figuresArr, figCount);
                    }
                    break;
                case "read from file":
                    String filename = sc.nextLine();
                    readData.readFromFile(filename, figuresArr);
                    break;
                case "delete an element":
                case "element info":

                    int elementIndex;
                    do{
                        elementIndex = Integer.parseInt(sc.nextLine());
                    }while(elementIndex >= 0 && elementIndex < figuresArr.size());
                    figuresArr.remove(elementIndex);
                    if(command.equals("element info")){
                        figuresArr.get(elementIndex).toString();
                        System.out.println(figuresArr.get(elementIndex).perimeter());
                    }
                    break;
                case "delete all figures":
                    figuresArr.clear();
            }
        }
    }
}

/*public Figure makeFigure(String figName, Figure figure, Scanner scanner, CreateFigure createFigure){
        switch(figName){
            case "circle":
                System.out.println("Enter circle's extractRadius:");
                double rad = Double.parseDouble(scanner.nextLine());
                figure = createFigure.createCircle(rad);
                break;
            case "rectangle":
                System.out.println("Enter rectangle's sides:");
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                figure = createFigure.createRectangle(length, width);
                break;
            case "triangle":
                System.out.println("Enter triangle's sides:");
                double sideA = Double.parseDouble(scanner.nextLine());
                double sideB = Double.parseDouble(scanner.nextLine());
                double sideC = Double.parseDouble(scanner.nextLine());
                figure = createFigure.createTriangle(sideA, sideB, sideC);
                break;
        }
        return figure;
    }*/

