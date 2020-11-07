import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            for(int i = 0;i<n;i++){
                int l1 = pp.nextInt();
                int r1 = pp.nextInt();
                int l2 = pp.nextInt();
                int r2 = pp.nextInt();
                
               if(l1 != l2){
                   System.out.println(l1 + " " + l2);
               }
               else{
                   System.out.println((l1+1) + " " + l2);
               }
            }
        pp.close();
    }

}