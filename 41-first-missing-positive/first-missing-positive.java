class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n) {
            int correctIndex=nums[i]-1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                // swap(nums,i,correctIndex);
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return n + 1;
    }
}
