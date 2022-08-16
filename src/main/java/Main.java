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
                System.out.print("Enter circle's radius: ");
                double rad = Double.parseDouble(scanner.nextLine());
                System.out.println();
                figure = createFigure.createCircle(rad);//TODO: ДА ГО ДООБМИСЛЯ
                break;
            case "rectangle":
                break;
            case "triangle":
                break;
        }
    }
}
