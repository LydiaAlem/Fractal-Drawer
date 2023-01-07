import java.util.Scanner;
import java.awt.Color;

public class FractalDrawer {
    static double totalArea=0;  
    public FractalDrawer() {}

    public static double getArea(){
        return totalArea;
    }

    public static void setArea(double d) {
        totalArea = d;
    }

    public static double drawFractal(String type) {
        Canvas can = new Canvas(800, 800); //Setting the size of the canvas
        Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY, Color.cyan}; //Creating the color bank

        if(type.equals("Triangle")){
            drawTriangleFractal(300, 700, 200, 200, userColor[0], can, 6) ;
        }

        if(type.equals("Rectangle")){
            drawRectangleFractal(200,200,400 ,200, userColor[0], can, 6);
        }

        if(type.equals("Circle")){
            drawCircleFractal(100, 150, 200, userColor[0], can, 6);
        }
        return getArea(); 
    }

    public static void drawTriangleFractal(double x, double y, double width, double height, Color c, Canvas can, int level){
        Triangle new_Triangle = new Triangle(x, y, width, height);
        new_Triangle.setColor(c);
        if(level == 0){
            can.drawShape(new_Triangle);
        }
        else {
            
            Color[] userColor = {Color.RED, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.PINK};
            //Adjusting all of the triangle iterations to follow fractal pattern.
            drawTriangleFractal(x-(width/2),y,width/2,height/2, userColor[level], can, level - 1);
            Triangle new_Triangle1 = new Triangle(x, y, width, height);
            drawTriangleFractal(x+(width), y, width/2, height/2, userColor[level], can, level -1);
            Triangle new_Triangle2 = new Triangle(x, y, width, height);
            drawTriangleFractal(x+(width/4),y-width,width/2,height/2, userColor[level], can, level - 1);
            Triangle new_Triangle3 = new Triangle(x, y, width, height);
            can.drawShape(new_Triangle);
            totalArea = new_Triangle1.calculateArea() + new_Triangle2.calculateArea() + new_Triangle3.calculateArea(); //Sum of area
        }
    }

    public static void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle new_circle = new Circle(x, y, radius);
        new_circle.setColor(c);
        if(level == 0){
            can.drawShape(new_circle);
        }
        else {
            Color[] userColor =  {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            can.drawShape(new_circle);
            //Manipulating x and y positions using the radius, and continually making the radius smaller. 
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
    public static void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle new_rectangle = new Rectangle(x, y, width, height);
        new_rectangle.setColor(c);
        if(level == 0){
            can.drawShape(new_rectangle); //Using Canvas.java to draw the initial shape.
        }
        else{
            Color[] userColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK, Color.DARK_GRAY};
            //Manipulating the width and height to be smaller, and also using width to adjust the x and y positions.
            drawRectangleFractal(width/2, height/2, x - (width/2), y-(width/2), userColor[level], can, level - 1);
            Rectangle new_rectangle1 = new Rectangle(x, y, width, height);
            drawRectangleFractal(width/2, height/2, x - (width/2), y + (width), userColor[level], can, level - 1);
            Rectangle new_rectangle2 = new Rectangle(x, y, width, height);
            drawRectangleFractal(width/2, height/2, x + (width), y - (width/2), userColor[level], can, level - 1);
            Rectangle new_rectangle3 = new Rectangle(x, y, width, height);
            drawRectangleFractal(width/2, height/2, x + (width), y + (width), userColor[level], can, level - 1);
            Rectangle new_rectangle4 = new Rectangle(x, y, width, height);
            can.drawShape(new_rectangle);
            totalArea = new_rectangle.calculateArea() + new_rectangle1.calculateArea() + new_rectangle2.calculateArea() + new_rectangle3.calculateArea() + new_rectangle4.calculateArea();
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Pick: Circle, Rectangle or Triangle: "); //Asking user for input
        String type = input.nextLine();
        drawFractal(type); //Calling drawFractal based on the user's input
        System.out.println(totalArea);

    input.close(); 
    }
}
