// https://leetcode.com/problems/search-insert-position/

package solutions;

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (target < nums[start])
            return 0;
        else if (target > nums[end])
            return end + 1;
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            return end + 1;
        }
    }
}
