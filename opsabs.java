abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are created an animal");
    }
    public void eat(){
        System.out.println("animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("created an horse");
    }
    public void walk(){
        System.out.println("walks with 4 legs");
    }
}
class Hen extends Animal{
    public void walk(){
        System.out.println("walks with 2 legs");
    }
}

public class opsabs {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // // Animal animal = new Animal();
        // // animal.walk();  cannot be instantiated bcoz of runtime error
        // horse.eat();
    }
   
}
