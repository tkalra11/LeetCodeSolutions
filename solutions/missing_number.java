// https://leetcode.com/problems/missing-number/

package solutions;

public class missing_number {
    public static void main(String[] args) {
        int arr[]= { 4 , 0 , 1 , 2};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            if(nums[i] == nums.length || nums[i] == i) ++i ;
            else{
                int ind=nums[i];
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }
        }
        for(int j=0;j<nums.length;++j){
            if(nums[j] != j) return j;
        }
        return nums.length;
    }
}
