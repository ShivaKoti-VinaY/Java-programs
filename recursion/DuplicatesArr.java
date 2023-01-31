public class DuplicatesArr{
    public static void main(String[] args) {
        String a[]={"Java","C","C++","Python","Java","C"};
        boolean flag=false;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                System.out.println("The duplicates of an array is:"+a[i]);
                flag=true;
                }
            }
        }
    if(flag==false)
    {
        System.out.println("element is not found:");
    }
    }   
}