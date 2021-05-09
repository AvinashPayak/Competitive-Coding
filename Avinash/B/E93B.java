import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class E93B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            String s = pp.next();
            ArrayList<Integer> al = new ArrayList<Integer>();

            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == '1'){
                    int j = i;
                    while(j+1<s.length() && s.charAt(j+1) == '1') ++j;
                    al.add((j-i+1));
                    i = j;
                }
            }
            Collections.sort(al,Collections.reverseOrder());
            int sum = 0;
            for(int i=0;i<al.size();i+=2){
                sum +=al.get(i);
            }
            System.out.println(sum);
            
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

