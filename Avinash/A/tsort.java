import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0;i<n;i++){
                System.out.println(arr[i]);
            }
            

        pp.close();
    }
}