import java.util.*;

public class TCE12020 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            String s1 = pp.next();
            String s2 = pp.next();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for(int i = 0;i<s1.length();i++){
                arr1[s1.charAt(i)-'a']++;
            }
            for(int i=0;i<s2.length();i++){
                arr2[s2.charAt(i) - 'a']++;
            }
            boolean flag = false;
            for(int i=0;i<26;i++){
                if(arr1[i]>0 && arr2[i]>0) flag =true;
            }

            if(s1.length() == 1 && s1.charAt(0) != s2.charAt(0) || flag == false) System.out.println("NO");
            else System.out.println("YES");
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

