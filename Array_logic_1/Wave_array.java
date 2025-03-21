
import java.util.Arrays;

public class Wave_array {
//  Expected output 2  4   5    
//                   1   3

    public static void main(String[] args) {
        int a[] = {1, 3, 2, 4, 5};
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i += 2) {
            int temp = a[i];        //temp = 1
            a[i] = a[i + 1];        //a[i]=2
            a[i + 1] = temp;        // a[i+1]= 1
            // 2,1,3,4,5
        }
        System.out.println(Arrays.toString(a));
    }
}
