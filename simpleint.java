import java.util.Scanner;
public class simpleint{
    public static void main(String[] args) {
        double si, p, t, r; 
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter the principal amount");
        p = scan.nextDouble();
        System.out.println("Enter the tenure");
        t = scan.nextDouble();
        System.out.println("Enter the rate");
        r = scan.nextDouble();
    }
    si = (p*t*r)/100;
    System.out.println("Simple intrest is:" +si);
    }
} 