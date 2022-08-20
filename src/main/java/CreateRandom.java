import java.util.ArrayList;
import java.util.Random;

public class CreateRandom {
    private static CreateRandom instance;
    private CreateRandom(){}
    public static CreateRandom getInstance(){
        if(instance == null){
            instance = new CreateRandom();
        }
        return instance;
    }
    public void createRandomFigures(ArrayList<Figure> figuresArr){
        CreateFigure createFigure = CreateFigure.getInstance();
        Figure figure = null;
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
        figuresArr.add(figure);
    }
}
