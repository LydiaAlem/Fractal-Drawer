import java.awt.Color;
import java.lang.Math;

public class Circle{
    double xPosition;
    double yPosition;
    double radius;
    Color color;

    public Circle(double xPosition, double yPosition, double radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return (2 * Math.PI * radius);
    }

    public double calculateArea() {
        return (Math.PI * (radius * radius));
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPos(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Color getColor(){
        return color;
    }

    public double getXPos(){
        return xPosition;
    }
    
    public double getYPos() {
        return yPosition;
    }

    public double getRadius(){
        return radius;
    }
}
