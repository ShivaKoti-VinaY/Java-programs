import java.util.HashSet;
public class hashsetarr{
    public static void main(String[] args) {
        
        String arr[]={"Java","C","C++","Python","Java","C"};
        HashSet<String>langs=new HashSet();
        boolean flag=false;

        for(String l:arr){
            if(langs.add(l)==false){
                System.out.println("Found Duplicate elements:"+l);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Element is not found:");
        }
    }
}
