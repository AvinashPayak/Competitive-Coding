import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1;i<=n;i++){
                arr[i] = pp.nextInt();
            }
            int[] sol = new int[n+1];
            for(int i = 1;i<=n;i++){
                sol[arr[i]] = i;
            }
            for(int i = 1;i<=n;i++){
                System.out.print(sol[i] + " ");
            }
        pp.close();
    }
}