import java.util.Scanner;
import java.awt.Color;
import java.util.Random;
//- area is a total 
//-drawfractal function return area
//-update total area
public class FractalDrawer {
    static double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // contructor

    public static double getArea(){
        return totalArea;
    }

    public static void setArea(double d) {
        totalArea = d;
    }

    //TODO:

    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function

    // drawFractal returns the area of the fractal
    //Im asking the user for the choice in the MAIN METHOD!! and using if statememts
    public static double drawFractal(String type) {
        Canvas drawing = new Canvas(800,800);
        Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY, Color.cyan};
        double user = Math.random() * userColor.length; //Using the import random to generate random colors
        if(type.equals("Triangle")){
            //Triangle triangle = new Triangle(222000, 202020, 50000, 5000);
            drawTriangleFractal(400, 400,400, 600, userColor[0], drawing, 7) ;
            //
        }

        if(type.equals("Rectangle")){
            //Rectangle rectangle = new Rectangle(2220, 2220, 50000, 5000);
            drawRectangleFractal(200, 200, 400, 400, userColor[0], drawing, 7);
        }

        if(type.equals("Circle")){
            //Circle circle = new Circle(2220, 2220, 12220);
            drawCircleFractal(100, 400, 400, userColor[0], drawing, 7);
        }

        return getArea();
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public static void drawTriangleFractal(double x, double y, double width, double height, Color c, Canvas can, int level){
        Triangle new_Triangle = new Triangle(width, height, x, y);
        new_Triangle.setColor(c);
        if(level == 0){
            //Triangle new_Triangle = new Triangle(width, height, x, y);
            can.drawShape(new_Triangle);
        }
        else {
            Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            double user = Math.random() * userColor.length;
            can.drawShape(new_Triangle);
            //Triangle new_triangle = new Triangle(width, height, x, y);

            drawTriangleFractal(width/2, height/2, x-(width/4), y-(height), userColor[level], can, level -1);

            //drawTriangleFractal(width/2, height/2, x/2, y/2, user, can, level -1);
            //drawTriangleFractal(width/2, height/2, x/2, y/2, user, can, level -1);
            //setArea(getArea() + new_Triangle.calculateArea());
        }
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public static void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle new_circle = new Circle(x, y, radius);
        new_circle.setColor(c);
        if(level == 0){
            //Circle new_circle = new Circle(x, y, radius);
            can.drawShape(new_circle);
        }
        else {
            Color[] userColor =  {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            double user = Math.random() * userColor.length;
            can.drawShape(new_circle);
            Circle first_circle = new Circle(x, y, radius/2);
            drawCircleFractal(radius/2, x-(radius), y+radius, userColor[level], can, level - 1);
            Circle second_circle = new Circle(x, y, radius/2);
            drawCircleFractal(radius/2, x+(radius), y+radius, userColor[level], can, level - 1);
            Circle third_circle = new Circle(x, y, radius/2);
            drawCircleFractal(radius/2, x-(radius), y-radius, userColor[level], can, level - 1);
            Circle fourth_circle = new Circle(x, y, radius/2);
            drawCircleFractal(radius/2, x+(radius), y-radius, userColor[level], can, level - 1);
            totalArea = new_circle.calculateArea() + first_circle.calculateArea()+ second_circle.calculateArea()+third_circle.calculateArea()+fourth_circle.calculateArea();
        }

    }
    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public static void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle new_rectangle = new Rectangle(x, y, width, height);
        new_rectangle.setColor(c);

        if(level == 0){
            //Rectangle new_rectangle = new Rectangle(x, y, width, height);
            can.drawShape(new_rectangle);
        }
        else{
            Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            //double user = Math.random() * userColor.length;
            //Rectangle new_rectangle = new Rectangle(x, y, width, height);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);
            drawRectangleFractal(width/2, height/-2, x/-2, y/-2, userColor[level], can, level - 1);

            //drawRectangleFractal(width/2, height/2, x/2, y/2, user, can, level - 1);
            //drawRectangleFractal(width/2, height/2, x/2, y/2, user, can, level - 1);
            //setArea(getArea() + new_rectangle.calculateArea());
        }


    }
    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal
    // should print area of fractal
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Pick: Circle, Rectangle or Triangle: ");
        String type = input.nextLine();
        drawFractal(type);
        System.out.println(totalArea);

    input.close();
    }
}
