package Arrays;

// 1929
// https://leetcode.com/problems/concatenation-of-array/description/
// Concatenation of Array

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int[]  ans = new int[2 * n];

        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
           ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
