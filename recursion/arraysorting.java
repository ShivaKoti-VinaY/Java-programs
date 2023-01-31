import java.util.Arrays;
import java.util.Collections;

public class arraysorting{
    public static void main(String[] args) {
        // int a[]={30,50,20,10,60};

        //approach 1
        // System.out.println("Array order before sorting"+Arrays.toString(a));
        // Arrays.parallelSort(a);
        // System.out.println("Array order before sorting"+Arrays.toString(a));

        // approach 2
        // System.out.println("Array order before sorting:"+Arrays.toString(a));
        // Arrays.sort(a);
        // System.out.println("Array after sort:"+Arrays.toString(a));
        int a[]={30,50,20,10,60};
        System.out.println("Array order before sorting:"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Array after sort:"+Arrays.toString(a));
    }
}
    

