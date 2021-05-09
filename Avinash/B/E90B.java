import java.util.Scanner;

public class E90B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            String s = pp.next();
            int c0 = 0;
            int c1 = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == '0') c0++;
                else c1++;
            }
            int moves = Math.min(c0,c1);
            if(moves%2 == 1) System.out.println("DA");
            else System.out.println("NET");
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

