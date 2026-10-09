
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int lsum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rsum = total - lsum - nums[i];

            if (lsum == rsum) {
                return i;
            }

            lsum += nums[i];
        }

        return -1;
    }
}
