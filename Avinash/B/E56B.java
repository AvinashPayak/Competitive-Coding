import java.util.*;

public class E56B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            String s = pp.next();
            char[] charr = s.toCharArray();
            boolean flag = false;
            for(int i = 1; i<s.length();i++) if(s.charAt(0) != s.charAt(i)) flag = true;

            Arrays.sort(charr);
            if(flag == true) System.out.println(String.valueOf(charr));
            else System.out.println(-1);
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

