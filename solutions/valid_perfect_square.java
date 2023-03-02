// https://leetcode.com/problems/valid-perfect-square/

package solutions;

public class valid_perfect_square {
    public boolean isPerfectSquare(int num) {
        long start=2;
        long end=num/2;
        if(num==1) return true;
        else{
            while(start<=end){
                long mid=start+(end-start)/2;
                if(mid*mid == num)
                    return true;
                else if(mid*mid < num)
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return false;
    }
}
