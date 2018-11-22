class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int currMax = nums[0];
        
        for(int i=1; i<nums.length; i++){
            //adding up the current number making currmax if not then current number otself making it max.
            currMax = Math.max(currMax + nums[i],nums[i]);
            max = Math.max(currMax,max);
        }
        
        return max;
    }
}
