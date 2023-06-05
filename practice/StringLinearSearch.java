package practice;

public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Tushar";
        char target = 'u';
        int ind = search(name , target);
        if(ind == -1)
        {
            System.out.println(target + " is not in the string.");
        }
        else
        {
            System.out.println(target + " found at index " + ind);
        }
        }

static int search(String s, char target)
{
    if(s.length() == 0)
    return -1;

    for(int i = 0 ; i < s.length() ; ++i)
    {
        if( s.charAt(i) == target){
            return i;
        }
    }
    return -1;
}

}