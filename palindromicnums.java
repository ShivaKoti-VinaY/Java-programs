public class palindromicnums{
    public static void main(String[] args) {
        int n = 9;
        //spaces
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        //first half 
        for(int j=i;j>=1;j--){
            System.out.print(j);  
        }
        //seconf half
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
    //first half 
    for(int j=i;j>=1;j--){
        System.out.print(j);  
    }
    //seconf half
    for(int j=2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
    }
}
}
