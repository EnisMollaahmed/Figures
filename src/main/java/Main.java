import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args){


    }
    public void readFromFile(String fileName){
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
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void readFromTheConsole() {
        Scanner scanner = new Scanner(System.in);
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure;//TODO:ДА ПОСТВАЯ ТОВА ВЪВ ФУНКЦИЯ
        String figName;
        do{
            figName = scanner.nextLine();
            figName.toLowerCase();
        }while(!(figName.equals("circle")) && !(figName.equals("rectangle")) && !(figName.equals("triangle")));
        switch(figName){
            case "circle":
                System.out.println("Enter circle's radius:");
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
