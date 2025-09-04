class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long n=nums.length;
        long count=0;
        long sub=1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count+=sub;
                sub++;
                // count+=sub;
            }
            else{
                sub=1;
            }
            
        }
        return count;
    }
}