import java.util.Scanner;
import java.util.Arrays;
public  class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = 3;
            int[] arr = new int[n];
            int count1 = 0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                if(arr[i] == 1){
                    count1++;
                }
            }
            Arrays.sort(arr);
            int sol = 1;
            if(count1 == 1){
                arr[1] = arr[1] + 1;
                for(int i=1;i<n;i++){
                    sol*=arr[i];
                }
            }
            else{
                for(int i=0;i<n;i++){
                    sol*=arr[i];
                } 
                if(count1 !=0){
                    sol*=count1;
                }
            }
            System.out.println(sol);

        pp.close();
    }

}