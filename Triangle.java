import java.lang.Math;
public class Triangle {
    double xPosition;
    double yPosition;
    double width = 5;
    double height = 10;
    Color color;

    public static void main(String[] args) {  
        //System.out.println(calculatePerimeter());
        //System.out.println(calculateArea());
        //System.out.println(calculatePerimeter());
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
        return (width * height) / 2;
    }
    
    public Color setColor(Color color){
        return color;
    }

    public void setPos(double Xposition, double Yposition){
        return;
    }

    public void setHeight(double height) {
        return;
    }

    public void setWidth(double width) {
        return;
    }

    public Color getColor(Color color) {
        return color;
    }

}

