import java.util.*;

public class B548 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = pp.nextInt();
        }
        long ans = 0;
        long temp = 1000000001;
        for(int i=n-1;i>=0;i--){
            temp = Math.max(0, Math.min(temp-1,arr[i]));
            ans+=temp;
        }
        System.out.println(ans);
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

