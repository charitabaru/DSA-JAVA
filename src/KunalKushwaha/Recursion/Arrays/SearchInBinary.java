package KunalKushwaha.Recursion.Arrays;

//Rotated sorted  binary Search
public class SearchInBinary {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int ans = findIndexBinary(arr,7,0,arr.length-1);
        System.out.println(ans);
    }
    public static int findIndexBinary(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target >= arr[s] && target <= arr[mid] ){
                return findIndexBinary(arr,target,s,mid-1);
            }else {
                return findIndexBinary(arr,target,mid+1,e);
            }
        }
        if(arr[s]>arr[mid]){
            return findIndexBinary(arr,target,mid+1,e);
        }
        return findIndexBinary(arr,target,s,mid-1);
    }
}
