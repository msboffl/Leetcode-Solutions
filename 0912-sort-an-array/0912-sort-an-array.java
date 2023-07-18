import java.util.ArrayList;

class Solution {
    private static int[] merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
        return nums;

    }

    private static void sortArray(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        sortArray(nums, low, mid);
        sortArray(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        sortArray(nums, low, high);
        return nums;
    }
}
