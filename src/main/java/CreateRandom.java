import java.util.ArrayList;
import java.util.Random;
public class CreateRandom {
    private static CreateRandom instance;
    private GlobalConstsAndVars values = GlobalConstsAndVars.getInstance();
    private CreateRandom(){}
    public static CreateRandom getInstance(){
        if(instance == null){
            instance = new CreateRandom();
        }
        return instance;
    }
    public void createRandomFigures(ArrayList<Figure> figuresArr, int figsCount){
        Figure figure = null;
        Random rand = new Random();
        for (int i = 0; i < figsCount; i++){
            int chooseFig = rand.nextInt(3);
            switch (chooseFig){
                case 0:
                    double radius = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    figure = new Circle(radius);
                    break;
                case 1:
                    double width = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    double length = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    figure = new Rectangle(length, width);
                    break;
                case 2:
                    double sideA = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    double sideB = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    double sideC = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) +  values.MIN;
                    figure = new Triangle(sideA, sideB, sideC);
                    break;
            }
            figuresArr.add(figure);
        }
    }
}
