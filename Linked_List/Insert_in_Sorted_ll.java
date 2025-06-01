package Linked_List;

public class Insert_in_Sorted_ll {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertSorted(Node head, int key) {
        Node newNode = new Node(key);

        if (head == null || key < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node cur = head;
        while (cur.next != null && cur.next.data < key) {
            cur = cur.next;
        }

        newNode.next = cur.next;
        cur.next = newNode;

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
        head = insertSorted(head, x);
        System.out.print("After inserting " + x + ": ");
        printList(head);
    }
}
