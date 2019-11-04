523. Continuous Subarray Sum
560. Subarray Sum Equals K

//3 4 7 2 -3 1 4 2

//store cumulative sum 
// x x x  --- x if(sum - k) is exist in the map that starting from that point till the current point elements sum = k,

now the combination we got at 

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k); //it will maake the combination equal to the the no of elemnts exist sum - k
                
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}


rem + n*k

if same rem come again mean n*k existed in between


// same funda just store sum%k
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else
                map.put(sum, i);
        }
        return false;
    }
}
