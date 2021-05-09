import java.util.*;

public class B718 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int m = pp.nextInt();

            for(int i = 0;i<n;i++){
                long[] arr = new long[m];
                for(int j=0;j<m;j++) arr[j] = pp.nextLong();
                Arrays.sort(arr);
                rotate(arr, m, i);
                for(int j=0;j<m;j++) System.out.print(arr[j] + " ");
                System.out.println();
            }
        }
        pp.close();
    }

    public static void rotate(long[] arr,int n,int d){
        reverse(arr , 0 , n-1);
        reverse(arr, 0, d-1); 
        reverse(arr, d, n-1); 
    }

    public static void reverse(long[] nums, int start, int end){

        while(start<end){
            long temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

