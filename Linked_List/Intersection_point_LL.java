package Linked_List;

public class Intersection_point_LL {

    // Make ListNode static so it can be used inside static methods
    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Move the pointer of the longer list forward by the difference
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Now move both pointers one step at a time
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; // Intersection point found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection
    }

    private static int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // List A: 4 -> 6 \
        //                   -> 8 -> 10 -> 12
        // List B: 1 -> 3 /

        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        common.next.next = new ListNode(12);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(6);
        headA.next.next = common;

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(3);
        headB.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
