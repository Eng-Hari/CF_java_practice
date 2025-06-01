package Linked_List;

public class Remove_Kth_node {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node removeNode(Node head, int k) {
        if (head == null || k == 0) {
            return null;
        }

        Node cur = head;
        Node prev = head;

        int count = 1;

        while (cur != null) {
            if (count % k == 0) {
                if (prev != null) {
                    prev.next = cur.next;
                }
            } else {
                prev = cur;
            }

            cur = cur.next;
            count++;

        }
        return head;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        System.out.println(" ORIGINAL LIST : ");
        printList(head);

        int k = 2;
        head = removeNode(head, k);
        System.out.println(" LIST AFTER REMOVING EVERY " + k + "th NODE : ");
        printList(head);

    }

}
