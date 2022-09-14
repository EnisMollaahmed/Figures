import java.util.ArrayList;
import java.util.Random;
public class CreateRandom {
    private final GlobalConstsAndVars values = GlobalConstsAndVars.getInstance();

    public static final double MIN = 0.0;
    public static final double MAX = 100.0;
    private static Random rand = new Random();

    public stataic int getRandomValue() {
        return rand.nextDouble() * ((values.MAX - values.MIN) + 1)) + values.MIN;
    }

    public Figure createRandomFigure() {
        switch (rand.nextInt(3)) {
            case 0 -> {
                return new Circle(getRandomValue());
            }
            case 1 -> {
                return new Rectangle(getRandomValue(), getRandomValue());
            }
            case 2 -> {
                return new Triangle(getRandomValue(), getRandomValue(), getRandomValue());
            }
            default {
                throw new Exception("Incorrect figure type!");
            }
        }
    }

    public void createRandomFigures(ArrayList<Figure> figuresArr, int figsCount) {
        for (int i = 0; i < figsCount; i++){
            figuresArr.add(createRandomFigure());
        }
    }
}
