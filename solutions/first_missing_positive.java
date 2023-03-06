// https://leetcode.com/problems/first-missing-positive/

package solutions;


public class first_missing_positive {
    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int current = 0 ;
        while (current < nums.length) {
            int correct = nums[current] - 1 ;
            if( nums[current] > 0 && nums[current] <= nums.length && nums[correct] != nums[current]) {
                int temp = nums[current] ;
                nums[current] = nums[correct] ;
                nums[correct] = temp ;
            }
            else current++;
        }
        current = 0 ;
        while(current < nums.length){
            if(nums[current] != current +1 )
                return current+1;
            current++;
        }
        return nums.length + 1 ;
    }
}
