public class Dog extends Animal{

    String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    
    public void eat(){
        super.eat();

        System.out.println(name + " is eating dog food because it is a " + breed);
        
    }
}
