public class patern{
    public static void main(String[] args) {
     int n=4;
    //upper half    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.println("*");
        }
    }
    //spaces
    int spaces = 2 *(n-i);           
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }
}