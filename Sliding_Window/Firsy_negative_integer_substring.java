package Sliding_Window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Firsy_negative_integer_substring {

    public static void main(String[] args) {
        int[] a = {-8, 2, 3, -6, 10};
        int n = a.length;
        int k = 2;

        List<Integer> result = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();

        int i = 0, j = 0;

        while (j < n) {
            // Add current negative to queue
            if (a[j] < 0) {
                q.addLast(a[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Window size hit
                if (!q.isEmpty()) {
                    result.add(q.peekFirst());
                } else {
                    result.add(0);
                }

                // Remove element going out of window
                if (!q.isEmpty() && a[i] == q.peekFirst()) {
                    q.removeFirst();
                }

                i++;
                j++;
            }
        }

        // Print the result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

}
