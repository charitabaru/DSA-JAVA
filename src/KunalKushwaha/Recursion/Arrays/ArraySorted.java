package KunalKushwaha.Recursion.Arrays;

public class ArraySorted {
    public static void main(String[] args) {
       int[] arr = {1,3,3,4,5};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] <= arr[i+1] && sorted(arr,i+1);
    }
}
