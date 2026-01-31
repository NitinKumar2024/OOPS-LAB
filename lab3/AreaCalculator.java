package lab3;

public class AreaCalculator {

    public void calculateArea(int side){
        int area = side * side;
        System.out.println("The area of square is: " + area);
    }

    public void calculateArea(int length, int width){
        int area = length * width;
        System.out.println("The area of rectangle is: " + area);
    }

    public void calculateArea(double radious){
        double area = 3.14 * radious * radious;
        System.out.println("The area of circle is: " + area);
    }
    
}
