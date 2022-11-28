interface Animal{
    int eyes = 2;
    void walk();

}
interface Herbivores{

}
class Horse implements Animal , Herbivores{   // we can achieve multiple inheritance by this using interfaces
    public void walk(){
        System.out.println("walks with 4 legs");
    }
}


public class intfs {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
