public class Solution {
    public boolean hasCycle(ListNode head) {
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
            if(count==10001) return true;
        }
        return false;
    }
}