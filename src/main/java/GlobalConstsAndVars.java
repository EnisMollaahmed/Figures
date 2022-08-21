public class GlobalConstsAndVars {
    private static GlobalConstsAndVars instance;
    private GlobalConstsAndVars(){}
    public static GlobalConstsAndVars getInstance(){
        if (instance == null){
            instance = new GlobalConstsAndVars();
        }
        return instance;
    }
    public final double MIN = 0.0;
    public final double MAX = 100.0;
}
