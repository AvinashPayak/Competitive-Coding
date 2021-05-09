import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            int max = 0;
            int min = 101;
            int maxpos=0;
            int minpos=0;
            for(int i=0,j=n-1;i<n && j>=0;i++,j--){
                if(arr[i]>max){
                    max = arr[i];
                    maxpos = i;
                }
                if(arr[j]<min){
                    min = arr[j];
                    minpos= n-1-j;
                }
            }
            if(minpos>=n-maxpos){
                System.out.println(maxpos + (minpos) -1);
            }
            else {
                System.out.println(maxpos + (minpos));
            }
        pp.close();
    }

}