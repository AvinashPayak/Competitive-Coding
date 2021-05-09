import java.util.*;

public class B491 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n;i++){
            if((float)sum >= 4.5*n) break;
            sum = sum - arr[i] + 5;
            count++;
        }
        System.out.println(count);
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

