import java.util.*;

public class E69B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextInt();
        }
        boolean flag = false;
        int i = 0;
        while(i<n-1){
            if(arr[i]<arr[i+1]) i++;
            else break;
        }
        while(i<n-1){
            if(arr[i]>arr[i+1]) i++;
            else break;
        }
        if(i == n-1) flag = true;
        if(flag == true) System.out.println("YES");
        else System.out.println("NO");
        
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

