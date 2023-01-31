//array should not have duplicates
//array need not to be in sorted order
//values should be in range
public class missingnumberinarray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,7,8,9,10};
        int sum1=0;

        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("sum of elements is:"+sum1);

        int sum2=0;
        
        for(int i=1;i<=10;i++){
            sum2=sum2+i;
        }
        System.out.println("Range of an elements are:"+sum2);
        System.out.println("The missing number is:"+(sum2-sum1));
    }
}
