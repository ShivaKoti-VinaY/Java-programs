import java.util.Arrays;

public class Arraysequal{
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
        int a2[]={1,2,3,4,5,6};

        boolean status = Arrays.equals(a1,a2);

        if(status==true){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }

    }
    
}
