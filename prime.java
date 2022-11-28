//Natural number>1
//which has only 2 factors 1 and itself
//19=>1 and 19 =>Prime number
//28=>1,2,4,7,14,28=>not a prime
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:"); 
        
        int num = sc.nextInt();  
        int count=0;

        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0)
                count++;
            }
        if(count==2){
            System.out.println("Prime number");
        }    
        else{
            System.out.println("not a prime number");
        }
        }
    else{
        System.out.println("not a prime number");
    }
}
}
