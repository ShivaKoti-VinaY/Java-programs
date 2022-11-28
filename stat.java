class Student{
    String name;
    static String school;   // once we declare static we can use multiple times in all classes

    public static void changeschool(){
        school = "new school";
    }
}
public class stat {
    public static void main(String[] args) {
        Student.school = "JPS";
        Student student1 = new Student();
        student1.name = "vinay";
        System.out.println(student1.school);

    }
    
}
