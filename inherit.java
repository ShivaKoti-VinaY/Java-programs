class shape{        //base class
    public void area(){
        System.out.println("Display the area:");
    }

class Triangle extends shape{         //derived class-single level
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Equilateraltriangle extends Triangle{      //derived class  multilevel
    @Override
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);         //multiple derived classes-->hirarchial inheritance
    }

}
public class inherit{
    public static void main(String[] args) {
      // TODO document why this method is empty
    }
}
}