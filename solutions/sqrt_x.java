// https://leetcode.com/problems/sqrtx/

package solutions;

public class sqrt_x {
    public int mySqrt(int x) {
        double start=0;
        double end=x;
        if(x==0) return 0;
        else if(x==1) return 1;
        else{
            while(start<=end){
                double mid=start+(end-start)/2;
                if(mid*mid == x|| Math.abs(mid*mid-x)<0.000001)
                    return (int)mid;
                else if(mid*mid < x)
                    start=mid;
                else
                    end=mid;
            }
        }
        return 0;
    }
}
