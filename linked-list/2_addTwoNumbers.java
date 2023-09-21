/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-99);
        ListNode temp = dummy;
        int carry = 0;
        int a, b;
        while(t1!=null || t2!=null || carry!=0){
            if(t1==null){
                a = 0;
            }else{
                a = t1.val;
            }
            if(t2==null){
                b = 0;
            }else{
                b = t2.val;
            }
            if(a + b + carry > 9){
                System.out.print((( a + b + carry )%10)+ " ");
                temp.next = new ListNode((a + b + carry)%10);
                temp = temp.next;
                carry = 1;
            } else{
                temp.next = new ListNode((a + b + carry)%10);
                temp = temp.next;
                System.out.print(a + b + carry + " ");
                carry = 0;
            }
            
            if(t1!=null)
                t1 = t1.next;
            if(t2!=null)
                t2 = t2.next;
        }
        System.out.println();

        temp = dummy;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();

        while(t2!=null){
            System.out.print(t2.val + " ");
            t2 = t2.next;
        }
        
        return dummy.next;
    }
}
