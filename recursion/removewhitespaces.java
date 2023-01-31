public class removewhitespaces{
    public static void main(String[] args) {
        String str="Vinay       kumar        shivakoti";

        System.out.println("expression before "+str);
        str=str.replaceAll("\\s","");
        System.out.println("after expression "+str);
    }
    
}
