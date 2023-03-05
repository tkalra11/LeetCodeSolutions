// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package solutions;

import java.util.ArrayList;
import java.util.List;

public class numbers_disappeared {
    public static void main(String[] args) {
        int[] arr= { 4 , 3 , 2 , 7 , 8 , 2 , 3 , 1 };
        List<Integer> ans=findDisappearedNumbers(arr);
        for (int i = 0; i < ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> missing = new ArrayList<>();
        current=0;
        while (current< nums.length){
            if( current != nums[current] - 1 )
                missing.add(current+1);
            current++;
        }
        return missing;
    }
}
