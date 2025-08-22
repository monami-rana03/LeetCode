class Solution {
    public int removeDuplicates(int[] nums) {

        //int[] arr=new int[nums.length];
        int count=1;
        for (int i=1;i<nums.length;i++){
             if(nums[i]!=nums[count-1]){
                    nums[count]=nums[i];
                    count+=1;
                 }
            // for (int j=i+1;j<nums.length;j++){
            //     if(nums[i]!=nums[j]){
            //         arr[count++]=nums[i];
            //     }
            // }    
        }
        return count;
    }    
}