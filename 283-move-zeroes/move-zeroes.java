class Solution {
    public void moveZeroes(int[] nums) {
        //int arr[]={0,1,0,3,12};
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[p]=nums[i];
                p++;
            }
        }
        while(p<nums.length){
            nums[p++]=0;
        }
    }
}