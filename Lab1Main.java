import java.util.Scanner;

public class Lab1Main {

    public static void main(String[] args) {

        // 1. Program to Demonstrate Basic Java Syntax and Control Structures

        System.out.println("Hi Nitin");
        // int number = 10;
        // System.out.println("The number is " + number);

        Scanner sc = new Scanner(System.in); // Create the scanner object
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // Read an integer
        
        System.out.println("The number is " + number);

        if(number>=0){
            for(int i = 1; i< 6; i++){
                System.out.println(i*number);
            }
        }
        else{
            System.out.println("Negative Number");
        }

        sc.close();

        

}
}