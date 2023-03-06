// https://leetcode.com/problems/find-all-duplicates-in-an-array/

package solutions;

import java.util.ArrayList;
import java.util.List;

public class duplicates {
    public static void main(String[] args) {
        int arr[]= { 4 , 3 , 2 , 7 , 8 , 2 , 3, 1 };
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> duplicates = new ArrayList<>();
        current=0;
        while (current< nums.length){
            if( current != nums[current] - 1 )
                duplicates.add(nums[current]);
            current++;
        }
        return duplicates;
    }
}
