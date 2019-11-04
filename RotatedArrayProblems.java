//153. Find Minimum in Rotated Sorted Array

public class Solution {
    public int findMin(int[] nums) {
//         int low = 0;
//         int high = nums.length - 1;
        
//         while(low <= high){
//             if(nums[low] <= nums[high]){
//                 return nums[low];
//             }
            
//             int mid = (low + high)/2;
            
//             if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]){
//                 return nums[mid];
//             }
            
//             else if(nums[mid] >= nums[low]){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
        
//         return -1;
        //our result is in the unsorted part
        
    int low = 0, high = nums.length - 1;
       while(low <= high){
           
            if(nums[low]<=nums[high]){
                return nums[low];
        }
           int mid = (low + high)/2;
           //mid + 1 coz mid is bigger and it can never be min element
           if(nums[mid] > nums[high]) // this part is not sorted
               low = mid+1; 
           //mid is smaller than nums[high] therfor it can be a part of smaller
           else
               high = mid;
       } 
       return -1; 
    }
}


33. Search in Rotated Sorted Array

** See which part is sorted.



81. Search in Rotated Sorted Array II

Same as first one, only diff are dups, so if those two condition don't not satisfy ,,, reduce high--; because we are comparing mid with high 
