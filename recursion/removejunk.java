public class removejunk{
    public static void main(String[] args) {
        String s = "%^&*&(*&%^%^$**&()()(%^%^ Vinay kumar shivakoti - 9014902187 ";

        s=s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s);

    }
    
}
