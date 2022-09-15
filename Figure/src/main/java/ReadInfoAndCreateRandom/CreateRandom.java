package ReadInfoAndCreateRandom;

import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Triangle;

import java.util.ArrayList;
import java.util.Random;

public class CreateRandom {
    public static final double MIN = 0.0;
    public static final double MAX = 100.0;
    private static Random rand = new Random();

    public static double getRandomValue() {
        return rand.nextDouble() * ((MAX - MIN) + 1) + MIN;
    }

    public Figure createRandomFigure() throws Exception {
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
            default -> {
                throw new Exception("Incorrect figure type!");
            }
        }
    }

    public void createRandomFigures(ArrayList<Figure> figuresArr, int figsCount) throws Exception {
        for (int i = 0; i < figsCount; i++){
            figuresArr.add(createRandomFigure());
        }
    }
}
