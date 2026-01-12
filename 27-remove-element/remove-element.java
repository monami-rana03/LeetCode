class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;  // index for elements not equal to val

        for (int i = 0; i < nums.length; i++) {

            // If current element is not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i];  // place it at index k
                k++;                // move k forward
            }
        }
        return k;
    }
}
