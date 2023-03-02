// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

package solutions;

public class ransomnote {
    static boolean canConstruct(String ransomNote,String magazine)
    {
        int[] alphabets=new int[26];
        for(char ch:magazine.toCharArray()){
            alphabets[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(alphabets[ch-'a'] == 0)
                return false;
            else
                alphabets[ch-'a']--;
        }
        return true;
    }
}
