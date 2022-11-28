// class pen{
//     String color;
//     String type; //ball point , gel

//     public void write(){
//         System.out.println("write something:");
//     }
//     public void printcolor(){
//         System.out.println(this.color);   //this keyword is used to call constructers and parameters
//     }
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(){
    //     System.out.println("constructer called:");  //parameter less constructer
    // }
    // Student(String name, int age){                    //parameterized constructer
    //     this.name = name;
    //     this.age = age;
    // }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){
        System.out.println(" ");
    }
    public void printInfo(String name){            
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){        //polymorphism
        System.out.println(name +" "+ age);
    }
}   
public class oopsconcepts {
    public static void main(String[] args) {
    // pen pen1 = new pen();    //pen is an object color and type is an classes of a pen
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "Ball point";

        // pen1.printcolor();
        // pen2.printcolor();
        
        Student s1 = new Student();   //new allocates a space in heap where it stores all objects
        s1.name = "vinay";            //(); this means a function known as constructor-->initializes objects
        s1.age = 22;

        // Student s2 = new Student(s1);   // copy constructer

        s1.printInfo(s1.name,s1.age);
    }
}
