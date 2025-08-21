class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=nums[0];
        for(int i=0;i<nums.length;i++){
            //for(int j=i+1;j<nums.length;j++){
             if(count==0){
                count++;
                majority=nums[i];
            }
            else if(majority==nums[i]){
                count++;
            }
            else{
                count--;
            }
                // if(nums[j]==nums[i]){
                //     count+=1;
                //     if(count>nums.length/2){
                //         return nums[j];
                //     }
                    
                // }
                // else{
                //     continue;
                // }
            //}
        
            //System.out.println(nums[i]);
        }   
        return majority; 
    }
}