import java.util.*;

public class C693 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = pp.nextInt();
            long sum = 0;
            for(int i=0;i<n;i++){
                int j = i;
                long tempsum = 0;
                while(j<n){
                    tempsum+=arr[j];                    
                    j+= arr[j];
                }
                if(tempsum>=sum) sum = tempsum;
            }
            System.out.println(sum);
        }
        pp.close();
    }

    static short countBits(int n){
        short count = 0;
        while(n!=0){
            count+=(n & 1);
            n >>>= 1;
        }
        return count;
    }

    static short parity(int n){
        short result = 0;
        while(n!=0){
            result ^= 1;
            n &= n-1;
        }
        return result;
    }

    static long swapBits(long n, int i, int j){
        if(((n >>> i) & 1) != ((n >>> j) & 1)){
            long bitMask = ((1L << i) | (1L << j));
            n ^= bitMask;
        }
        return n;
    }
}