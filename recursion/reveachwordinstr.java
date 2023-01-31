public class reveachwordinstr{
    public static void main(String[] args) {
        String str ="Anna Mom Madam Level";
        String[] words=str.split(" ");
        String reversesString="";

        for (String w : words) {
            String reverseword="";
            for(int i=w.length()-1;i>=0;i--){
                reverseword=reverseword+w.charAt(i);
            }
            reversesString=reversesString+reverseword+" ";
        }
        System.out.println(reversesString);
    }
    
}
