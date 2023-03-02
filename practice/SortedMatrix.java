package practice;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1 , 2 , 3 , 4 },
                { 5 , 6 , 7 , 8 },
                { 9 , 10 , 11 , 12 },
                { 13 , 14 , 15 , 16 }
        };
        int target = 15 ;
        System.out.println(Arrays.toString(search( arr , target )));
    }
    static int[] search(int[][] matrix,int target){
        int cstart = 0;
        int cend = matrix[0].length - 1;
        int cmid = cstart + ( cend - cstart ) / 2;
        int rstart = 0;
        int rend = matrix.length - 1;

        while( rstart != rend - 1){
            int rmid = rstart+ ( rend - rstart ) / 2;
            if( matrix[rmid][cmid] == target )
                return new int[]{rmid,cmid};
            else if( matrix[rmid][cmid] < target )
                rstart = rmid;
            else
                rend = rmid;
        }

        if( matrix[rstart][cmid] == target )
            return  new int[]{rstart,cmid};
        else if( matrix[rstart+1][cmid] == target )
            return  new int[]{rstart+1,cmid};
        else if( matrix[rstart][cmid] > target )
            return binarySearch(matrix,rstart,cstart,cmid-1,target);
        else if( matrix[rstart][cmid] < target )
            return binarySearch(matrix,rstart,cmid+1,cend,target);
        else if ( matrix[rstart+1][cmid] > target )
            return binarySearch(matrix,rstart+1,cstart,cmid-1,target);
        else
            return binarySearch(matrix,rstart+1,cmid+1,cend,target);
    }
    static int[] binarySearch(int[][] matrix,int row,int cstart,int cend,int target){
        while( cstart <= cend ){
            int mid = cstart + ( cend - cstart );
            if ( matrix[row][mid] == target )
                return new int[]{row,mid};
            else if( matrix[row][mid] < target )
                cstart = mid + 1;
            else
                cend = mid - 1;
        }
        return new int[]{-1,-1};
    }
}