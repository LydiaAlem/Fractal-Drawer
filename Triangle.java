import java.lang.Math;
import java.awt.Color;

public class Triangle {
    double xPosition;
    double yPosition;
    double width;
    double height;
    Color color;


//Constructor:
    public Triangle(double xPosition, double yPosition, double width, double height){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return (this.width + (Math.sqrt(Math.pow(this.width, 2.0) + (4.0 * Math.pow(this.height, 2.0))))); //Formula for isoceles perimeter
    } 

    public double calculateArea() {
        return ((this.width * this.height) / 2);
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

    public Color getColor() {
        return this.color;
    }

    public double getXPos(){
        return this.xPosition;
    }

    public double getYPos(){
        return this.yPosition;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }
}
