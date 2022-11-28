public class swapnum{
    public static void main(String[] args) {
        int a=10,b=20;

        System.out.println("before swapping nums are.." +a +" " +b);

        // int t=a;
        // a=b;
        // b=t;
        b=a+b-(a=b);

        System.out.println(("after swapping nums are.." +a + " " +b));
    }
    
}
