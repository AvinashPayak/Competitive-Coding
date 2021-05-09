import java.util.*;

public class B16 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int m = pp.nextInt();
        int[] arr = new int[11];
        for(int i = 0;i<m;i++){
            int mb = pp.nextInt();
            int ma = pp.nextInt();
            arr[ma] += mb;
        }
        long sum = 0;
        int index = 10;
        while(index>=0 && n !=0){
            if(arr[index] <= n) {
                sum += arr[index]*index;
                n = n-arr[index];
                index--;
            }
            else if(arr[index]>n) {
                sum += n*index;
                n=0;
            }
        }
        System.out.println(sum);
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

