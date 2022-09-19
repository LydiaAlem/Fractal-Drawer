//CIRCLE CLASS:
import java.lang.Math;

public class Circle{;

    public static void main(String[] args) {
        //Accessor Method:
        calculatePerimeter(5, 5, 2);
        calculateArea(3);
    }
                    
//METHODS:
    public static double calculatePerimeter(double xPosition, double yPosition, double radius){
        return (2 * Math.PI * radius);
    }

    public static double calculateArea(double radius) {
        return (Math.PI * (radius * radius));
    }

    public void setColor(String Color) {
        return;
    }

    public double setPos(double xPosition, double yPosition) {
        this.xPosition = xPosition;

    }
    
}


   

    


    
    
}

