package Leetcode.ArrayQuestions.TwoSums;

public class main {
    public static void main(String[] args) {
        Solution sol = new Solution(); // Creates an instance of the Solution class
        int[] nums = {1, 2, 3}; // Example input array
        int[] result = sol.getConcatenation(nums); // Calls the getConcatenation method and stores the result
        for (int num : result) { // Iterates over the result array
            System.out.print(num + " "); // Prints each element of the result array followed by a space
        }
    }
}
