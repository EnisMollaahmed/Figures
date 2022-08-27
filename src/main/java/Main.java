import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
public class Main {//TODO: RESEARCH GENERICS

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Figure> figuresArr = new ArrayList<Figure>();
        ReadData readData = ReadData.getInstance();
        CreateRandom createRandom = CreateRandom.getInstance();
        String command = sc.nextLine();
        command = command.toLowerCase();
        while(!command.equals("end")){
            switch(command){
                case "read from console":
                case "create random":
                    int figCount = Integer.parseInt(sc.nextLine());
                    if(command.equals("create random")){
                        createRandom.createRandomFigures(figuresArr,figCount);
                    }
                    else{
                        readData.readFromTheConsole(figuresArr, figCount);
                    }
                    break;
                case "read from file":
                    String filename = sc.nextLine();
                    readData.readFromFile(filename, figuresArr);
                    break;
                case "delete an element":
                case "element info":

                    int elementIndex;
                    do{
                        elementIndex = Integer.parseInt(sc.nextLine());
                    }while(elementIndex >= 0 && elementIndex < figuresArr.size());
                    figuresArr.remove(elementIndex);
                    if(command.equals("element info")){
                        figuresArr.get(elementIndex).toString();
                        System.out.println(figuresArr.get(elementIndex).perimeter());
                    }
                    break;
                case "delete all figures":
                    figuresArr.clear();
            }
        }
    }
}
