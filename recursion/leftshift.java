public class leftshift{
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        //getbit
        // if((bitmask&n)==0){
        //     System.out.println("Bit was Zero");
        // }
        // else{
        //     System.out.println("Bit was One");
       
        //set bit operation
        int newNumber=bitmask|n;
        System.out.println(newNumber);

        }
}