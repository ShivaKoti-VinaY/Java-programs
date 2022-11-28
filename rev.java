import java.util.Scanner;

public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = sc.nextInt();

        // int rev = 0;

        // while(num!= 0)
        // {   
        //     rev=rev*10+num%10;
        //     num=num/10;
        // }
        //using string buffer class
        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer rev = sb.reverse();

        //using string builder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("The rev number is:"+rev);
    }
    
}
