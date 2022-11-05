package com.java.concepts.dsa.linkedlist;

public class BinaryNumInLinkedListToInt {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        getDecimal(node1);
    }

    public static void getDecimal(ListNode node) {
        int ans = 0;
        ListNode temp = node;
        while (temp != null) {
            ans *= 2;
            ans += temp.val;
            temp = temp.next;
        }
        System.out.println(ans);
    }
}
