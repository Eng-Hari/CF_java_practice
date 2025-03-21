
public class Count_squares {

    public static void main(String[] args) {
        int n = 9;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) { //finding the square root of n
            count++;
        }
        System.out.println(count);
    }
}
