package Stack_Quees;

public class Queue_using_Array {

    // Make the Queue class static
    static class Queue {

        int front, rear, capacity;
        int[] queue;

        Queue(int size) {
            front = rear = 0;
            capacity = size;
            queue = new int[capacity];
        }

        void enqueue(int item) {
            if (rear == capacity) {
                System.out.println("Queue is full");
                return;
            }
            queue[rear++] = item;
        }

        void dequeue() {
            if (front == rear) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }

        void display() {
            if (front == rear) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }

        void front() {
            if (front == rear) {
                System.out.println("Queue is empty");
            } else {
                System.out.println("Front element: " + queue[front]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();   // Output: 10 20 30
        q.dequeue();
        q.display();   // Output: 20 30
        q.front();     // Output: Front element: 20
    }
}
