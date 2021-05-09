import java.util.*;

public class Div3B653 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            String s = pp.next();
            Stack<Character> stack = new Stack<>();
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(') stack.push('(');
                if(s.charAt(i) == ')') {
                    if(stack.empty()) count ++;
                    else stack.pop(); 
                }
            }
            System.out.println(count);
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

