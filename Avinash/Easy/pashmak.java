/* Wrong answer */
import java.util.Scanner;
import java.util.*;

 class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int x1 = pp.nextInt();
            int y1 = pp.nextInt();
            int x2 = pp.nextInt();
            int y2 = pp.nextInt();
            Set<Integer> hash_Set = new HashSet<Integer>(); 
            hash_Set.add(Math.abs(x1));
            hash_Set.add(Math.abs(y1));
            hash_Set.add(Math.abs(x2));
            hash_Set.add(Math.abs(y2));
            if(hash_Set.size() >2){
                System.out.println(-1);
            }
            else{
                int max = Math.max(Math.max(x1, y1), Math.max(x2, y2));
                int min = Math.min(Math.min(x1, y1), Math.min(x2, y2));
                int[] ans = new int[8];
                ans[0] = min;
                ans[1] = min;
                ans[2] = min;
                ans[3] = max;
                ans[4] = max;
                ans[5] = min;
                ans[6] = max;
                ans[7] = max;

                for(int i=0;i<7;i=i+2){
                   if((x1 == ans[i] && y1 == ans[i+1]) || (x2 ==ans[i] && y2 == ans[i+1])){
                    }
                    else{
                        System.out.print(ans[i] + " " + ans[i+1] + " ");
                    }
                }

            }
            
        
        pp.close();
    }

}