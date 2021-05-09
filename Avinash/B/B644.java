import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class B644 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }

            Arrays.sort(arr);
            int dif = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++) if(arr[i+1]-arr[i] < dif) dif = arr[i+1] - arr[i];
            System.out.println(dif);
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

