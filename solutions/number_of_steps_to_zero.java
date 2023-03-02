// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

package solutions;

public class number_of_steps_to_zero {
    static int numberOfSteps(int num){
            int steps=0;
            while(num>0){
                if((num^1)==(num+1))
                    num=num>>1;
                else
                    num--;
                steps++;
            }
            return steps;
    }
}
