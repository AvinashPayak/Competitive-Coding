import java.util.Scanner;

public class B529 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int imax = 0;
        int imin = 0;
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            if(arr[i]<min) {
                min = arr[i];
                imin = i;
            }
        }
        if(n == 2) System.out.println(0);
        else {
            int smin = Integer.MAX_VALUE;
            int smax = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                if(i != imax && arr[i] > smax) smax = arr[i];
                if(i != imin && arr[i]<smin) smin = arr[i];
            }
            System.out.println(Math.min(smax-min,max-smin));
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

