package Linked_List;

public class Rotate_left {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node rotated(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return null;
        }

        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        temp.next = head;

        k = k % len;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;

    }

    // Function to print linked list
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        int x = 4;

        System.out.print("Linked List: ");
        printList(head);

        int k = 3;
        System.out.print("The rotated linked list is: ");
        Node rotatedHead = rotated(head, k);
        printList(rotatedHead);

    }
}
