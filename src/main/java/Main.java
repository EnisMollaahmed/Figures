import java.util.Scanner;
public class Main {
    public static void main(String[] args){
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
