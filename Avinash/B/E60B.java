import java.util.*;

public class E60B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int m = pp.nextInt();
        int k = pp.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextInt();
        }
        Arrays.sort(arr);
        long ans = 0;
        while(m>0){
            if(m>=k) {
                ans+= arr[n-1]*k;
                m -= k;
            }
            else {
                ans += arr[n-1]*m;
                m = 0;
            }
            ans += arr[n-2];
            m--;
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