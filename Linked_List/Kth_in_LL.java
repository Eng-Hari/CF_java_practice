package Linked_List;

public class Kth_in_LL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int PrintValue(Node head, int k) {
        Node temp = head;

        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }

        return temp.data;
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
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.print("Linked List: ");
        printList(head);

        int k = 3; // Example value for k
        int value = PrintValue(head, 3);
        System.out.println("The " + k + "th element from the end is: " + value);

    }
}
