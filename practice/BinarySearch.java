/*
- Needs sorted arrays
- Steps:
    - Find middle element
    - check if middle is target , or reduce the search space to one side of the middle element
*/

// package practice;

public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 7 , 10 , 17 , 19 , 21 , 39 , 56 , 109} ; 
        int target = 21;
        int ind = search(arr, target);
        if(ind == -1) System.out.println(target + " is not in the array");
        else System.out.println(target + " found at index : " + ind);
    }
    static int search(int[] arr , int target) {
        int start = 0 , end = arr.length - 1 ;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
            return mid;
            else if(arr[mid] < target)
            start = mid+1;
            else
            end = mid-1;
        }
        return -1;
    }
}