import java.util.*;

public class B386 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            String s = pp.next();
            char[] arr = new char[n];
            if(n%2 == 1){
                int r = n-1;
                int l = 0;
                for(int i=n-1;i>=0;i--){
                    if(i%2 == 0) {arr[r] = s.charAt(i); r--;}
                    else {arr[l] = s.charAt(i); l++;}
                }
            }
            else{
                int r = n-1;
                int l = 0;
                for(int i=n-1;i>=0;i--){
                    if(i%2 == 0) {arr[l] = s.charAt(i); l++;}
                    else {arr[r] = s.charAt(i); r--;}
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
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

