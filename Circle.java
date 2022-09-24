/CIRCLE CLASS:
import java.lang.Math;

public class Circle{
    static double xPosition;
    static double yPosition;
    static double radius;
    static Color color;

    public static void main(String[] args) {
        //calculatePerimeter(5.0);
        //calculateArea(3);
    }

//I'm not sure if this is the EXACT way to add the constructor?
    // public Circle(double xPosition, double yPosition, double radius) {
    //     this.xPosition = xPosition;
    //     this.yPosition = yPosition;
    //     this.radius = radius;
    // }

    public double calculatePerimeter(double radius){
        return (2 * Math.PI * radius);
    }

    public double calculateArea(double radius) {
        return (Math.PI * (radius * radius));
    }

    public void setColor(Color color) {
        color = color;
    }

    public void setPos(double xPosition, double yPosition) {
        xPosition = xPosition;
        yPosition = yPosition;
    }

    public void setRadius(double radius){
        radius = radius;
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





   

    


    
    
}

