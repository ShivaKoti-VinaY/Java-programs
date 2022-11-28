public class sumofarray{
    public static void main(String[] args) {
        int a[]={5,6,22,7,9};
        int sum=0;

        // for(int i=0;i<=a.length-1;i++){
        //     sum=sum+a[i];
        // }
    //enhanced forloop
    
    for(int value:a){
        sum=sum+value;
    }
    System.out.println("Sum of array elements are:"+sum);    
    }
    
}
