package com.pixel.peopletechgroup;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store next node
            current.next = prev;              // Reverse the current node's pointer
            prev = current;                   // Move prev to current
            current = nextNode;               // Move current to next
        }
        return prev; // New head
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

