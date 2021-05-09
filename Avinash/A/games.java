import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] home = new int[n];
            int[] guest = new int[n];
            for(int i = 0;i<n;i++){
                home[i] = pp.nextInt();
                guest[i] = pp.nextInt();
            }
            int count = 0;
            for(int i =0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(home[i] == guest[j]){
                        count++;
                    }
                }
            }
            System.out.println(count);       
        pp.close();
    }
}