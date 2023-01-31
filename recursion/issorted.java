/*in this program we are taking array 
which is in increaing order seeing whether 
it is correct order of sorted array or not*/
public class issorted{
    public static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            return false;
        }
        return isSorted(arr, index+1);
    }    
    public static void main(String[] args) {
        int arr[]={1,3,3,4};
        System.out.println(isSorted(arr,0));
    }
}
