public class ExtractString {

    public static String extractNumbers(String line){
        String extractNums = line;
        extractNums = extractNums.replaceAll("[^\\d]", " ");
        extractNums = extractNums.trim();
        extractNums = extractNums.replaceAll(" + ", " ");
        return extractNums;
    }
    public static String extractFigureName(String extractFigureName){
        extractFigureName = extractFigureName.replaceAll("[0-9]", "");
        extractFigureName = extractFigureName.trim();
        extractFigureName = extractFigureName.toLowerCase();
        return extractFigureName;
    }
}
