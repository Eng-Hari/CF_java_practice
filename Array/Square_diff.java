
public class Square_diff {

    public static void main(String[] args) {
        int n = 5;
        int sumofsquare = (n * (n + 1) * (2 * n + 1)) / 6;
        int square = (n * (n + 1)) / 2;
        int squareofsum = square * square;
        int diff = (int) Math.abs(sumofsquare - squareofsum);
        System.out.println(diff);
    }
}
