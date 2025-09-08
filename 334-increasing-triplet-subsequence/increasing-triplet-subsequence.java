class Solution {
    public boolean increasingTriplet(int[] nums) {
        int l=nums.length;
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for(int m=0;m<l;m++){
            if(nums[m]<=i){
                i=nums[m];
            }
            else if(nums[m]<=j){
                j=nums[m];
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}