package Leetcode.ArrayQuestions.TwoSums;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // initializing the loop size by *2 n
        for(int i = 0; i < n; i++){
            ans[i] = nums[i]; // first loop
            ans[i + n] = nums[i]; // second loop
        }
        return ans;
    }
}
