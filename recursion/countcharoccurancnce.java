public class countcharoccurancnce{
    public static void main(String[] args) {
        String s = "Java programming with OOps java";

        int tc=s.length();
        int tcr=s.replace("a","").length();
        int count = tc-tcr;
        System.out.println("Number of occurance is:"+count);
    }
    
}
