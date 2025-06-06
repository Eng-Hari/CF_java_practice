package Binary_Search_Adv;

// Mock VersionControl class
class VersionControl {

    // Set the first bad version here for testing
    int bad = 4;

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}

// Your solution class
public class First_bad_version extends VersionControl {

    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        First_bad_version obj = new First_bad_version();
        int n = 7; // total versions
        int result = obj.firstBadVersion(n);
        System.out.println("First bad version: " + result);
    }
}
