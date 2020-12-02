import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n];
            int sum =0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                sum+=arr[i];
            }

            Arrays.sort(arr);
            sum/=2;
            int ans=0;
            int count =0;
            n=n-1;
            while(ans<=sum && n!=-1){
                ans+=arr[n];
                count++;
                n--;
            }
            System.out.println(count);

        pp.close();
    }

}