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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;//no nodes
        if(head.next==null) return head;// one node
        if(head.next.next==null) return head;// two node
        ListNode oddHead = head;
        ListNode evenHead=head.next;
        ListNode temp=head;
        ListNode evenHeadFixed=evenHead;
        while(oddHead.next!=null && evenHead.next!=null){
            oddHead.next=evenHead.next;
            oddHead=oddHead.next;
            evenHead.next=oddHead.next;
            evenHead=evenHead.next;
        }
        oddHead.next=evenHeadFixed;
        return head;
}
}