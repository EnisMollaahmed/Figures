import Controller.Controller;
import Figures.Figure;
import ReadInfoAndCreateRandom.CreateRandom;
import ReadInfoAndCreateRandom.ReadData;

import java.util.ArrayList;
import java.util.Scanner;

public class FigureApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figure> figuresArr = new ArrayList<>();
        ReadData readData = new ReadData();
        CreateRandom createRandom = new CreateRandom();
        Controller.console(figuresArr,sc,readData,createRandom);
    }
}
