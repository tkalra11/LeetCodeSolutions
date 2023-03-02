// https://leetcode.com/problems/first-bad-version/

package solutions;

public class first_bad_version {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int bad=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                bad=Math.min(mid, bad);
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return bad;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
