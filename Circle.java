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
        return (2.0 * Math.PI * this.radius);
    }

    public double calculateArea() {
        return (Math.PI * (this.radius * this.radius));
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
        return this.color;
    }

    public double getXPos(){
        return this.xPosition;
    }
    
    public double getYPos() {
        return this.yPosition;
    }

    public double getRadius(){
        return this.radius;
    }
}
