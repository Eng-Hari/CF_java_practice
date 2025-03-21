package Sorting;

public class Insertion_sort {

    public static void main(String[] args) {
        int n = 5;
        int a[] = {5, 4, 8, 10, 9};
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
                // now j=-1 => loop not execute and the valu for j updated from 0 to -1
            }
            a[j + 1] = key;
        }//here jth value is -1 (-1+1 = 0)
        // In the place of j[0] = key. key is 4
        //4 is assigned to j[0]th position
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
