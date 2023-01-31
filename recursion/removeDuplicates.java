public class removeDuplicates{
    public static boolean[] map=new boolean[26];//map will consists of alphabets a-z as 0-->25 
    public static void removeallDuplicates(String str, int idx, String newString){
        if(idx==str.length()){//in 'base' case we reach to last string it will our newString
            System.out.println(newString);
            return;
        }                           
        char currChar=str.charAt(idx);//declaring currChar variable on char to track string by using charAt()function
        if(map[currChar-'a']){ //currChar-'a'=map index like a-a=0 b-b=1 z-a=25.. char-char=int value of index if it matches shows T else false
            removeallDuplicates(str, idx+1, newString);//when currChar is matching index it will show true and we shoud not add that string on newString
        } 
        else{
            newString+=currChar;//when u r seeing it first time it should added to newString
            map[currChar-'a']=true;//next we are updating that value on map
            removeallDuplicates(str, idx+1, newString);
        }//map[pos]=true when gets first element as true again it will not take that element prints only one element
    }
    public static void main(String[] args) {
        String str="viiinaaaannnavvvvaayyy";
        removeallDuplicates(str,0, "");
    }
}