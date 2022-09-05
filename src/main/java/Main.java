import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figure> figuresArr = new ArrayList<>();
        ReadData readData = new ReadData();
        CreateRandom createRandom = new CreateRandom();
        Controller controller = new Controller();
        controller.console(figuresArr,sc,readData,createRandom);
    }
}