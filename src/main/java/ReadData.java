import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
    private static ReadData instance;
    private ExtractString extractString = new ExtractString();
    private ReadData(){};
    public static ReadData getInstance(){
        if(instance == null){
            instance = new ReadData();
        }
        return instance;
    }
    public void readFromFile(String fileName, ArrayList<Figure> figuresArr){
        CreateFigure createFigure = new CreateFigure();
        Figure figure = null;
        try {
            File myFile = new File(fileName);
            if (myFile.exists()){
                FileReader file = new FileReader(myFile.getAbsolutePath());
                BufferedReader buffReader = new BufferedReader(file);
                String line = buffReader.readLine();
                while( line  != null){
                    String extractFigureName = extractString.extractFigureName(line);
                    extractFigureName = FormatTheString.capitalize(extractFigureName);
                    figure = createFigure.CreateOneFigure(extractFigureName, extractString.extractNumbers(line));
                    figuresArr.add(figure);
                    line = buffReader.readLine();
                }

                buffReader.close();
            }else{
                System.out.println("Invalid file name or file path!");
                return;
            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public void readFromTheConsole(ArrayList<Figure> figuresArr, int figCount) throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        CreateFigure createFigure = new CreateFigure();
        Figure figure = null;

        for(int i = 0; i < figCount; i++){
            String figData = scanner.nextLine();
            String figName = extractString.extractFigureName(figData);
            while(!(figName.equals("circle")) && !(figName.equals("rectangle")) && !(figName.equals("triangle"))){
                figData = scanner.nextLine();
                figName = extractString.extractFigureName(figData);
            }
            figName = FormatTheString.capitalize(figName);
            String values = extractString.extractNumbers(figData);
            figure = createFigure.CreateOneFigure(figName,values);
            figuresArr.add(figure);
        }
        scanner.close();
    }
}
