package lab3;

public class Box {

    double length, width, height;
    
    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(double length){
        this.length = length;
        this.width = length;
        this.height = length;
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume(){
        return this.length * this.width * this.height;
    }
}
