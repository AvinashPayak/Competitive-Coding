import java.util.Scanner;

public class B634 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int a = pp.nextInt();
            int b = pp.nextInt();
            String ans = "";
            for(int i=0;i<b;i++){
                int temp = 97+i;
                char c = (char)temp;
                ans = ans + c;
            }
            int count = n/b + 1;
            String temp = ans;
            for(int i=0;i<count;i++){
                ans = ans+temp;
            }
            System.out.println(ans.substring(0,n));
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

