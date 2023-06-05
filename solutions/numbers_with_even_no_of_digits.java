// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package solutions;

public class numbers_with_even_no_of_digits {
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        if(String.valueOf(num).length() %2 == 0)
        return true;
        else
        return false;
    }
}
