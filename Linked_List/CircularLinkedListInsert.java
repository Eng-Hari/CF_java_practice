package Linked_List;

public class CircularLinkedListInsert {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert node at the end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;  // circular point to self
            return newNode;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        return head;
    }

    // Function to display the circular list
    static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Node head = null;

        // Inserting elements
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);

        // Displaying the list
        display(head);
    }
}
