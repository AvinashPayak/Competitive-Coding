import java.util.Scanner;

public class B580 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        long cm1 = 0;
        long c0 = 0;
        long ans = 0;

        for(int i = 0;i<n;i++){
            arr[i] = pp.nextLong();
            if(arr[i] <0) cm1++;
            else if(arr[i] == 0) c0++;

            if( arr[i] > 0 && arr[i] != 1) sum+= arr[i] -1;
            else if(arr[i] <0 && arr[i]!=-1) sum += (-arr[i]-1);
        }

        if(cm1%2 == 0 || (cm1%2 == 1 && c0 >0)) ans = sum + c0;
        else if(cm1%2 ==1 && c0 == 0) ans = sum +2;
        
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

