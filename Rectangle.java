//Rectangle Class:
public class Rectangle {
    double xPosition;
    double yPosition;
    double width;
    double height;
    Color color;

    //Constructor:
    public Rectangle(double xPosition, double yPosition, double width, double height){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter(){
        return (width * 2) + (height * 2);
    }

    public double calculateArea(){
        return (width * height);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setPos(double xPosition, double yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Color getColor(){
        return color;
    }

    public double getXPos(){
        return xPosition;
    }

    public double getYPos(){
        return yPosition;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

}


