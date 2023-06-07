// package practice;

import java.util.ArrayList;

public class find_the_evil_monsters {
    public ArrayList<Long> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int total=0;
        for(ArrayList<Integer> a:A){
            total+= (a.get(1)-a.get(0)+1);
        }
        ArrayList<Long> counts=new ArrayList<Long>();
        for(ArrayList<Integer> hero:B){
            int destroyed=0;
            for(ArrayList<Integer> monster:A){
                if(hero.get(0) >= monster.get(0) && hero.get(0) <= monster.get(0)){
                    if(hero.get(1) > monster.get(2)){
                        destroyed++;
                    }
                }
            }
            total=total-destroyed;
            counts.add((long)total);
        }
        return counts;
    }
}
