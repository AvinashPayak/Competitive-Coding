import java.util.Scanner;

public class B650 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int s0 =0;
            int s1 = 0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                if(i%2 != arr[i]%2){
                    if(i%2 == 0) s0++;
                    else s1++;
                }
            }
            if(s0 != s1) System.out.println(-1);
            else System.out.println(s0);
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

