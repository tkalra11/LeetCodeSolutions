// https://leetcode.com/problems/find-the-duplicate-number/

package solutions;

public class duplicate_number {
    public static void main(String[] args) {
        int[] arr={ 1 , 3 , 4 , 2 , 2 };
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
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
        int missing=Integer.MIN_VALUE;
        current=0;
        while (current< nums.length){
            if( current != nums[current] - 1 )
                missing=nums[current];
            current++;
        }
        return missing;
    }

}
