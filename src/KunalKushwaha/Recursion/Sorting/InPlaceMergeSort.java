package KunalKushwaha.Recursion.Sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(e-s ==1) {
            return;
        }
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeInPlace(arr,s,mid,e);

    }
    public static void mergeInPlace(int[] arr, int s, int m,int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //May be Possible that one of the array is not completed
        // then  add teh remaining elements to the array mix;
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

       for (int l =0; l < mix.length;l++){
           arr[s+l] = mix[l];
       }
    }
}
