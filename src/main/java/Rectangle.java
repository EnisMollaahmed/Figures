public class Rectangle implements Figure{
    private double length;
    private double width;
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    Rectangle(double lngth, double wdth){
        length = lngth;
        width = wdth;
    }
    Rectangle(Rectangle target){
        if(target != null){
            this.length = target.length;
            this.width = target.width;
        }
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    @Override
    public Figure clone(){
        return new Rectangle(this);
    }
}
