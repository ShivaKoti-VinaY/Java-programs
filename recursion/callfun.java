public class callfun{
    public static void main(String[] args) {
        sayHi(5);
    }
    static void sayHi(int count){
        System.out.println("Hi vinay:");
    if(count<=1){
        return;
    }
    sayHi(count-1);
    }
}