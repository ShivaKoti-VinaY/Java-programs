import java.util.Scanner;

public class sumof3largestnums{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("enter the second number");
        int b = sc.nextInt();

        System.out.println("enter the third number");
        int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println(a+" is an largest number");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b+" is an largest number");
        // }
        // else{
        //     System.out.println(c+" is an largest number");
        // }
        //ternary operator
        int largest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest+"is a largest number");
    }
    
}
