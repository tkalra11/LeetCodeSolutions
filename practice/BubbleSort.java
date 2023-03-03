package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1 , 4 , 5 , -1 , -1 };
        sort( arr );
        System.out.println(Arrays.toString( arr ));
    }
    static void sort(int[] arr){
        for ( int i = 0 ; i < arr.length ; i++ ) {
            boolean swapped=false;
            for (int j = 1; j < arr.length - i ; j++ ) {
                if( arr[j-1] > arr[j]){
                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                    swapped = true ;
                }
            }
            if(!swapped) break ;
        }
    }
}
