import java.util.Scanner;
import java.lang.Math;
public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int[][] arr = new int[5][5];
            int row =0;
            int col = 0;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    arr[i][j] = pp.nextInt();
                    if(arr[i][j] == 1){
                        row = i;
                        col = j;
                    }
                }
            }
            System.out.println(Math.abs((2-row)) + Math.abs((2-col)));
        pp.close();
    }

}