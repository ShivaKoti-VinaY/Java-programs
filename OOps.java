import java.beans.ConstructorProperties;
import java.util.*;
public class OOps {
    public static void main(String[] args) {

    // class and objects    
    // Person p1= new Person();    // for a person class we created aa objects as a name and age
    //                             //parent class
    // p1.age = 22;
    // p1.name = "Vinay kumar shivakoti";
     

    // System.out.println(p1.age +" "+ p1.name);
    // System.out.println(p2.age +" "+ p2.name);
    // p1.eat();
    // p2.walk();
    // p2.walk(2);
    // System.out.println(Person.count);

    // Developer d1 = new Developer(22, "Vinay kumar shivakoti");   child class
    // d1.walk();

    Encapsulationintro obj = new Encapsulationintro();
    obj.doWork();
    }
}
class Developer extends Person{

    public Developer(int age,String name){
        super(age,name);
    }
    @Override
    void walk(){    //runtime polymorphism
        System.out.println("Developer "+name+" is walking");
    }
    
}
 
class Person{
    String name;
    int age;

    static int count;

    public Person(){
        count++;
        System.out.println("");
    }
    public Person(int age, String name){
        this();
        this.name =  name;
        this.age = age;
    }

    void walk(){       //compile time polymorphism
        System.out.println(name + " is walking.");
    }
    void eating(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){  //compile time polymorphism
        System.out.println(name + " walked." + steps);
    }
    void doWork(){
        System.out.println("the person is Working");
    }
        
}