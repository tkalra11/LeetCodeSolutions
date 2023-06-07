// package practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1 , 4 , -1 , 5 , 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort( int[] arr ){
        for ( int i = 0 ; i <= arr.length -1 ; i++ ) {
            int last = arr.length - 1 - i ;

            int maxElem=arr[0];
            for (int j = 1; j <= last; j++) {
                if( arr[j] > arr[maxElem] )
                    maxElem = j ;
            }

            int temp = arr[last] ;
            arr[last] = arr[maxElem] ;
            arr[maxElem] = temp ;
        }
    }
}
