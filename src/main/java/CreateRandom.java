import java.util.ArrayList;
import java.util.Random;
public class CreateRandom {
    private final GlobalConstsAndVars values = GlobalConstsAndVars.getInstance();

    public void createRandomFigures(ArrayList<Figure> figuresArr, int figsCount){
        Figure figure = null;
        Random rand = new Random();
        for (int i = 0; i < figsCount; i++){
            int chooseFig = rand.nextInt(3);
            switch (chooseFig) {
                case 0 -> {
                    double radius = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    figure = new Circle(radius);
                }
                case 1 -> {
                    double width = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    double length = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    figure = new Rectangle(length, width);
                }
                case 2 -> {
                    double sideA = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    double sideB = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    double sideC = (rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
                    figure = new Triangle(sideA, sideB, sideC);
                }
            }
            figuresArr.add(figure);
        }
    }
}
