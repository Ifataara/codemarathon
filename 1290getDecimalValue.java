class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode curr = head;
         while (curr != null){
            num = (num*2)+curr.val;
            curr=curr.next;
        
         }
         return num;
        
    }
}
