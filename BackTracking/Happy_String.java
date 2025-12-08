package BackTracking;

public class Happy_String {

    private int count = 0;
    private String result = "";

    public String getHappyString(int n, int k) {
        backtrack(n, "", k);
        return result;
    }

    private void backtrack(int n, String path, int k) {
        if (path.length() == n) {
            count++;
            if (count == k) {
                result = path;
            }
            return;
        }

        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (path.length() == 0 || path.charAt(path.length() - 1) != ch) {
                backtrack(n, path + ch, k);
                if (!result.isEmpty()) {
                    return; // Early stop when result found

                }
            }
        }
    }

    public static void main(String[] args) {
        Happy_String finder = new Happy_String(); // ✅ Class name fixed
        System.out.println(finder.getHappyString(1, 3)); // Output: "c"
        System.out.println(finder.getHappyString(1, 4)); // Output: ""
        System.out.println(finder.getHappyString(3, 9)); // Output: "cab"
    }
}
