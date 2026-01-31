public class Student {

    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}
