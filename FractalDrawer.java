/ FractalDrawer class draws a fractal of a shape indicated by user input
import java.util.Scanner;
import java.awt.Color;
import java.util.Random;
public class FractalDrawer {
    static double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // contructor

    public static double getArea(){
        return totalArea;
    }

    public void setArea(double d) {
        totalArea = d;
    }

    //TODO:

    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function

    // drawFractal returns the area of the fractal
    //Im asking the user for the choice in the MAIN METHOD!! and using if statememts
    public static double drawFractal(String type) {
        Random rand = new Random();
        Canvas drawing = new Canvas();

        Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY, Color.cyan};
        double user = Math.random() * userColor.length;

        if(type.equals("triangle")){
            Triangle triangle = new Triangle(10, 10, 5, 5);
            drawTriangleFractal(triangle.getXPos(), triangle.getYPos(),triangle.getWidth(), triangle.getHeight(), userColor[-1], drawing, 0) ;
            //
        }

        if(type.equals("rectangle")){
            Rectangle rectangle = new Rectangle(10, 10, 5, 5);
            drawRectangleFractal(rectangle.getXPos(), rectangle.getYPos(), rectangle.getWidth(), rectangle.getHeight(), userColor[-1], drawing, 0);
        }

        if(type.equals("circle")){
            Circle circle = new Circle(10, 10, 5);
            drawCircleFractal(circle.getXPos(), circle.getYPos(), circle.getRadius(), userColor[-1], drawing, 0);
        }





        return getArea();



    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if(level == 10){
            Triangle new_Triangle = new Triangle(width, height, x, y);
            can.drawShape(new_Triangle);
        }
        else {
            Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            double user = Math.random() * userColor.length;
            Triangle new_Triangle = new Triangle(width, height, x, y);
            drawTriangleFractal(width/2, height/2, x/2, y/2, user, can, level + 1);
            drawTriangleFractal(width/2, height/2, x/2, y/2, user, can, level + 1);
            drawTriangleFractal(width/2, height/2, x/2, y/2, user, can, level + 1);
            setArea(getArea() + new_Triangle.calculateArea());
        }
    }





    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
    }
    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
    }
    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal
    // should print area of fractal
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Pick: circle, rectangle or triangle: ");
        String type = input.nextLine();

        drawFractal(type);

    input.close();
    }
}


