
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rtn = new ListNode(0), curr = rtn, a = l1, b = l2;
        int carry = 0;

        while(a != null || b != null || carry == 1){
            int dig = 0;
            if (a != null){
                dig += a.val;
                a = a.next;
            }
            if (b != null){
                dig += b.val;
                b = b.next;
            }
            dig += carry;

            if (dig >= 10){
                dig = dig % 10;
                carry = 1;
            }
            else carry = 0;
            
            curr.next = new ListNode(dig);
            curr = curr.next;
        }

        return rtn.next;
    }
}