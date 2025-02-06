package Arrays;

//1365
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
//  How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];

        for (int i =0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
