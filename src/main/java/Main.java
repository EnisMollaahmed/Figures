import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Main {//TODO:ДА ПОСАВЯ ФИГУРИТЕ В МАСИВ, КОЙТО МОЖЕ ДА СИ ПРОМЕНЯ РАЗМЕРА
    public static void main(String[] args){

    }
    public String extractNumbers(String line){
        String extractNums = line;
        extractNums = extractNums.replaceAll("[^\\d]", " ");
        extractNums = extractNums.trim();
        extractNums = extractNums.replaceAll(" + ", " ");
        return extractNums;
    }
    public void createRandomFigures(int countOfFigures){//TODO:CREATE FIGURES USING RANDOM NUMBERS
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure;
        Random rand = new Random();
        int chooseFig = rand.nextInt(3);
        switch (chooseFig){
            case 0:
                double radius = rand.nextDouble();
                figure = createFigure.createCircle(radius);
                break;
            case 1:
                double width = rand.nextDouble();
                double length = rand.nextDouble();
                figure = createFigure.createRectangle(length, width);
                break;
            case 2:
                double sideA = rand.nextDouble();
                double sideB = rand.nextDouble();
                double sideC = rand.nextDouble();
                figure = createFigure.createTriangle(sideA, sideB, sideC);
                break;
        }
    }
    public void readFromFile(String fileName){
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure;
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
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void readFromTheConsole() {
        Scanner scanner = new Scanner(System.in);
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure;
        String figName;
        do{
            figName = scanner.nextLine();
            figName.toLowerCase();
        }while(!(figName.equals("circle")) && !(figName.equals("rectangle")) && !(figName.equals("triangle")));
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
    }
}
