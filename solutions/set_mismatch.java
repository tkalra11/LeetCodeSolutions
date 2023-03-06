// https://leetcode.com/problems/set-mismatch/

package solutions;


import java.util.Arrays;

public class set_mismatch {
    public static void main(String[] args) {
        int[] arr={ 1 , 1 };
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int current = 0 ;
        while (current < nums.length) {
            int correct = nums[current] - 1 ;
            if( nums[correct] != nums[current]) {
                int temp = nums[current] ;
                nums[current] = nums[correct] ;
                nums[correct] = temp ;
            }
            else current++;
        }
        current=0;
        while (current < nums.length ) {
            if(current != nums[current] - 1 ){
                return new int[]{ nums[current] , current+1 } ;
            }
            ++current;
        }
        return new int[]{ -1 , -1 } ;
    }
}
