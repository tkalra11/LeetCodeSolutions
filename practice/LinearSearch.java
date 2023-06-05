package practice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1 , -3 , 5 , 2, 0 ,10 } ;
        int target = 3 ;
        int ind = search(arr, target);
        if(ind == -1) System.out.println(target + " is not in the array");
        else System.out.println(target + " found at index : " + ind);
    }
    static int search(int[] arr , int target)
    {
        if(arr.length == 0) return -1;

        for(int i = 0 ; i < arr.length ; ++i)
        {
            if(arr[i] == target) return target;
        }
        return -1;
    }
}
