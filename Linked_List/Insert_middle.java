package Linked_List;

public class Insert_middle {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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

    static Node InsertMiddle(Node head, int x) {

        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }

        if (head.next == null) {
            head.next = newNode;
            return head;
        }

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int mid = (length - 1) / 2;
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        newNode.next = head.next;
        head.next = newNode;

        return head;

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
        InsertMiddle(head, x);
        System.out.print("After inserting " + x + " in the middle:  ");

        printList(head);

    }
}
