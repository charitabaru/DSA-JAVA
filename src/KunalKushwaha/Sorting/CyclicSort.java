package KunalKushwaha.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclic(int[] nums){
        int i =0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
