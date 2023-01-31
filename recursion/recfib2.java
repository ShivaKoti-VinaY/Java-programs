public class recfib2{
    public static void fibonacci(int a, int b ,int n){
        if(n==1){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=92;
        fibonacci(a,b,n-2);
    }   
}
//754011380474634642