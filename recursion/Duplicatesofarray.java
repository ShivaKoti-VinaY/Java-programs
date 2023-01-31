import java.util.HashSet;

public class Duplicatesofarray{
    public static void main(String[] args) {
        boolean flag=false;

    //     for(int i=0;i<a.length;i++){
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]==a[j]){
    //             System.out.println("The duplicates of an array is:"+a[i]);
    //             flag=true;
    //             }
    //         }
    //     }
    // if(flag==false)
    // {
    //     System.out.println("element is not found:");
    // }
        String a[]={"Java","C","C++","Python","Java","C"};
        HashSet<String>langs=new HashSet<>();
        // System.out.println(langs.add("java"));
        // System.out.println(langs.add("python"));
        // System.out.println(langs.add("java"));
        for(String l:a){
            System.out.println(langs.add(l));
        }

    }
    
}
