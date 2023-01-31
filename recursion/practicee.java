public class practicee{
    public static void main(String[] args) {
        
    String a[]={"Vinay","shreyas","devan","kaucheek","sullit","leela cow","Vinay"};
    boolean flag=false;

    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                System.out.println("The dulicates are:"+a[i]);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No element found:");
        }
    }
    }
}