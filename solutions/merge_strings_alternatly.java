// https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

package solutions;

public class merge_strings_alternatly {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        if(word1.length() < word2.length()){
            str.append(getmerged(word1, word2.substring(0, word1.length())) + word2.substring(word1.length()));
        }
        else if(word2.length() < word1.length()){
            str.append(getmerged(word1.substring(0, word2.length()), word2) + word1.substring(word2.length()));
        }
        else{
            str.append(getmerged(word1, word2));
        }
        return str.toString();
    }
    static String getmerged(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < word1.length() ; ++i )
        {
            str.append(word1.charAt(i)+""+word2.charAt(i));
        }
        return str.toString();
    }
}
