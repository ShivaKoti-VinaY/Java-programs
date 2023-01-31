/*idx->current char,
count->track no.of x ,newstring->we create a new string which mov all xx to last*/
public class movexxxx{
    public static void moveAllx(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<=count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllx(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveAllx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str ="axbxcxxxxdx";
        moveAllx(str, 0, 0, "");
    }
}