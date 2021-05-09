import java.util.*;

public class B645 {
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
            boolean flag = false;
            for(int i = n-1;i>=0;i--){
                if(arr[i]<=i+1) {
                    System.out.println(i+2);
                    flag = true;
                    break;
                }
            }
            if(flag == false) System.out.println(1);
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

