package Linked_List;

public class Reverse_LL_givenSize {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse in groups of size k
    public Node reverseInGroups(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        return prev;
    }

    // Print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Manually create linked list without addLast()
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        Reverse_LL_givenSize obj = new Reverse_LL_givenSize();

        System.out.println("Original List:");
        obj.printList(head);

        int k = 4;
        head = obj.reverseInGroups(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        obj.printList(head);
    }
}
