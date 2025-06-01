package Linked_List;

public class Delete_given_node {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("-> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    static Node deletNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) {
            return head.next;
        }
        Node temp = head;
        for (int i = 1; i < x - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return head;

        }

        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        System.out.println(" ORIGINAL LIST : ");
        printList(head);

        int x = 3;

        head = deletNode(head, x);
        System.out.println("DELETING NODE of " + x + "th node : ");
        printList(head);

    }

}
