public class Binarysearch{
    public static void main(String[] args) {
       
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int l=0;
        int h=a.length-1;
        int key=5;
        boolean flag=false;

        while(l<=h){
            int m=(h+l)/2;

            if(a[m]==key){
                System.out.println("element found...");
                flag=true;
                break;
            }
            if(a[m]<key){
                l=m+1;
            }
            if(a[m]>key){
                h=m-1;
            }
        }


    }
    
}
