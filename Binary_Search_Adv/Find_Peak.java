package Binary_Search_Adv;

public class Find_Peak {

    public int findPeakElement(int[] nums) {
        int l = 0;
        int h = nums.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > nums[mid + 1]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }

        return l; // or h
    }

    public static void main(String[] args) {
        Find_Peak obj = new Find_Peak();
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = obj.findPeakElement(arr);
        System.out.println("Peak found at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
}
