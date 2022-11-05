package com.java.concepts.dsa.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        traverseNode(node1);
        ListNode revList = reverse(node1);
        traverseNode(revList);

    }

    private static ListNode reverse(ListNode head) {
        System.out.println("");
        if (head == null) {
            return null;
        }
        ListNode prev = null, current = head, next = head.next;

        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static void traverseNode(ListNode node) {
        ListNode temp = node;
        while(temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }
}
