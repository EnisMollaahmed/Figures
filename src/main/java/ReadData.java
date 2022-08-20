import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
    private static ReadData instance;
    private ReadData(){};
    public static ReadData getInstance(){
        if(instance == null){
            instance = new ReadData();
        }
        return instance;
    }
    public String extractNumbers(String line){
        String extractNums = line;
        extractNums = extractNums.replaceAll("[^\\d]", " ");
        extractNums = extractNums.trim();
        extractNums = extractNums.replaceAll(" + ", " ");
        return extractNums;
    }
    public void readFromFile(String fileName, ArrayList<Figure> figuresArr){
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure = null;
        try {
            File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("The file is created.");
            }
            else{
                System.out.println("The file already exists.");
            }
            FileReader file = new FileReader(myFile.getAbsolutePath());
            BufferedReader buffReader = new BufferedReader(file);
            String line = buffReader.readLine();
            String extractFigureName = line;
            extractFigureName = extractFigureName.replaceAll("[0-9]", "");
            extractFigureName = extractFigureName.trim();
            extractFigureName = extractFigureName.toLowerCase();
            Scanner scanner = new Scanner(extractNumbers(line));
            switch (extractFigureName){
                case "circle":
                    double radius = Double.parseDouble(scanner.next());
                    figure = createFigure.createCircle(radius);
                    break;
                case"rectangle":
                    double length = Double.parseDouble(scanner.next());
                    double width = Double.parseDouble(scanner.next());
                    figure = createFigure.createRectangle(length, width);
                    break;
                case "triangle":
                    double sideA = Double.parseDouble(scanner.next());
                    double sideB = Double.parseDouble(scanner.next());
                    double sideC = Double.parseDouble(scanner.next());
                    figure = createFigure.createTriangle(sideA, sideB, sideC);
                    break;
            }
            figuresArr.add(figure);
            scanner.close();
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void readFromTheConsole(ArrayList<Figure> figuresArr) {
        Scanner scanner = new Scanner(System.in);
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure = null;
        String figName;
        do{
            figName = scanner.nextLine();
            figName.toLowerCase();
        }while(!(figName.equals("circle")) && !(figName.equals("rectangle")) && !(figName.equals("triangle")));
        //makeFigure(figName, figure, scanner, createFigure); TODO: TO RESEARCH GENERIC
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
        figuresArr.add(figure);
        scanner.close();
    }
}
