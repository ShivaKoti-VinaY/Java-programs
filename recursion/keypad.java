import java.util.Scanner;

public class keypad{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombo(String str,int index,String combination){
        if(index==str.length()){
            System.out.print(combination+" ");
            return;
        }
        char currChar=str.charAt(index);//currChar=2 for that we took mapping 'def'
        String mapping=keypad[currChar-'0'];//2-0=2 for 2 it will get mapping value 'def'

        for(int i=0;i<mapping.length();i++){
            printCombo(str, index+1, combination+mapping.charAt(i));//every time we should add that combination to mapping function
        }                   //evertime it will add combinations d+e+f similary done for next levels 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        printCombo(str, 0, "");
    }
    
}
