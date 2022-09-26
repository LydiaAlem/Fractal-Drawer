// FractalDrawer class draws a fractal of a shape indicated by user input
import java.util.Scanner;
import java.awt.Color;
import java.util.Random;
public class FractalDrawer {
    static double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // contructor

    //TODO:

    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function

    // drawFractal returns the area of the fractal
    //Im asking the user for the choice in the MAIN METHOD!! and using if statememts
    public static double drawFractal(String type) {
        Random rand = new Random();
        Canvas drawing = new Canvas();
/*
 * HELP!!! Im trying to get a random color but im a little bit confused on how 
 * to use rand when searching a scope{}????  
 */
        Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
        Color rand_color = userColor.get(rand.nextColor(userColor.size()));


        if(type.equals("Triangle")){
            Triangle triangle = new Triangle(10, 10, 5, 5);
            drawTriangleFractal(triangle.getXPos(), triangle.getYPos(),triangle.getWidth(), triangle.getHeight(), userColor[-1], drawing, 0) ;
            //
        }

        if(type.equals("Rectangle")){
            Rectangle rectangle = new Rectangle(10, 10, 5, 5);
            drawRectangleFractal(rectangle.getXPos(), rectangle.getYPos(), rectangle.getWidth(), rectangle.getHeight(), userColor[-1], drawing, 0);
        }

        if(type.equals("Circle")){
            Circle circle = new Circle(10, 10, 5);
            drawCircleFractal(circle.getXPos(), circle.getYPos(), circle.getRadius(), userColor[-1], drawing, 0);
        }









    }
    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if(level == 10){
            Triangle new_Triangle = new Triangle(width, height, x, y);
            can.drawShape(new_Triangle);
        }
        else {
            Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            Triangle new_Triangle = new Triangle(width, height, x, y);
            
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
        System.out.println("Pick: Circle, Rectangle or Triangle: ");
        String type = input.nextLine();

        drawFractal(type);

    input.close();
    }
}


