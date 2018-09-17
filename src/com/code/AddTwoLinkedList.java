package com.code;
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class AddTwoLinkedList {
    public static void main(String[] args) {
        ListNode l1=null;
        ListNode l2=null;

        //create two linked list and pass it here
        addTwoNumbers(l1,l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode newLinkedList = new ListNode(0);
        ListNode result = newLinkedList;
        ListNode p = l1;
        ListNode q = l2;
        while(p!=null || q!=null){
            int pval = p!=null?p.val:0;
            int qval = q!=null?q.val:0;
            int sum = pval+qval+carry;
            carry = sum/10;
            result.next = new ListNode(sum%10);
            result = result.next;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if(carry>0){
            result.next = new ListNode(carry);
            result = result.next;
        }
        return newLinkedList.next;
    }
}
