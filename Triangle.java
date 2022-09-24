import java.lang.Math;
public class Triangle {
    double xPosition;
    double yPosition;
    double width;
    double height;
    Color color;

    public static void main(String[] args) {  
        //
        //
    }

//Constructor:
    public Triangle(double xPosition, double yPosition, double width, double height){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return (width + (Math.sqrt(Math.pow(width, 2) + (4 * Math.pow(height, 2))))); //Formula for isoceles perimeter
    } 

    public double calculateArea() {
        return ((width* height) / 2);
    }
    
    public void setColor(Color color){
        this.color = color;
    }

    public void setPos(double xPosition, double yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor(Color color) {
        return color;
    }

    public double getXPos(){
        return xPosition;
    }

    public double getYPos(){
        return yPosition;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

}
