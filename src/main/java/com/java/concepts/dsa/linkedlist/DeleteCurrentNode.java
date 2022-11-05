package com.java.concepts.dsa.linkedlist;

public class DeleteCurrentNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        traverseNode(node1);
        // delete the current node
        deleteNode(node3);
        traverseNode(node1);
    }

    public static void deleteNode(ListNode node) {
        System.out.println("");
        System.out.println("after deleting node "+node.val);

        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp.next = null;
    }

    public static void traverseNode(ListNode node) {
        ListNode temp = node;
        while(temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }
}
