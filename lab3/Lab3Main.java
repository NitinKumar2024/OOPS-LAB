package lab3;

public class Lab3Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        areaCalculator.calculateArea(5);
        areaCalculator.calculateArea(5, 15);
        areaCalculator.calculateArea(5.2);

        Box box = new Box();
        Box box1 = new Box(10);
        Box box3 = new Box(2, 3, 4);

        System.out.println(box.volume());
        System.out.println(box1.volume());
        System.out.println(box3.volume());
    }
}
