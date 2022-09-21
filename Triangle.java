public class Triangle {
    double Xposition;
    double Yposition;
    double width;
    double height;
    Color color;

    public static void main(String[] args) {  
        //System.out.println(calculatePerimeter(3,4));
        System.out.println(calculateArea(3,4));
    }

    public static double calculatePerimeter(double width, double Yposition) {
        return ((2* width + Yposition));
    }

    public static double calculateArea(double width, double height) {
        return((1/2) * width * height);
    }
    
    public static Color setColor(Color color){
        return color;
    }

    public static void setPos(double Xposition, double Yposition){
        return;
    }

    public static void setHeight(double height) {
        return;
    }

    public static void setWidth(double width) {
        return;
    }

    public static Color getColor(Color color) {
        return color;
    }

}

