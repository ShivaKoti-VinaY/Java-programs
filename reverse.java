public class reverse{
    public static void main(String[] args) {
        String str = "VINAY ANNA";
        String rev = " ";

    //     int len = str.length();

    //     for(int i=len-1;i>=0;i--){
    //         rev=rev+str.charAt(i);
    //     }
        
    //     
    
    //using character array method
    // char a[]=str.toCharArray();
    // int len = a.length;

    // for(int i=len-1;i>=0;i--){
    //     rev=rev+a[i];
    // }
    // System.out.println("the reverse String is:"+rev);
    StringBuffer sb = new StringBuffer(str);
    System.out.println(sb.reverse());
    }
    
}
