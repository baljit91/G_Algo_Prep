public class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
          // SIMILAR TOMAX SUBAARY PRONLEM.... BRUTE IS SIMPLE JUST CHECK THE PROFIT FOR PARTICULAR DAY
          //AGAINST ALL DAYS.... BEST IS THINK ABOUT WHAT PROFT HE MADE ON CONSECTUVE DAYS AND AND THEN APPLY KADANE
          //ALGO N THAT.
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
