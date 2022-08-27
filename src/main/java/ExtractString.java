public class ExtractString {
    public String extractNumbers(String line){
        String extractNums = line;
        extractNums = extractNums.replaceAll("[^\\d]", " ");
        extractNums = extractNums.trim();
        extractNums = extractNums.replaceAll(" + ", " ");
        return extractNums;
    }
    public String extractFigureName(String extractFigureName){
        extractFigureName = extractFigureName.replaceAll("[0-9]", "");
        extractFigureName = extractFigureName.trim();
        extractFigureName = extractFigureName.toLowerCase();
        return extractFigureName;
    }
}
