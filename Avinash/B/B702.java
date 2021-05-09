import java.util.*;

public class B702 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int c0 = 0;
            int c1 = 0;
            int c2 = 0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                arr[i] = arr[i]%3;
                if(arr[i] == 0) c0++;
                else if(arr[i] == 1) c1++;
                else c2++;
            }
            int ans[] = new int[3];
            ans[0] = c0;
            ans[1] = c1;
            ans[2] = c2;
            int count = 0;
            while(ans[0] != ans[1] || ans[1] != ans[2]){
                int max = Math.max(Math.max(ans[0],ans[1]),ans[2]);
                if(max == ans[0]){
                    ans[0]--;
                    ans[1]++;
                    count++;
                }
                else if(max == ans[1]){
                    ans[1]--;
                    ans[2]++;
                    count++;
                }
                else{
                    ans[2]--;
                    ans[0]++;
                    count++;
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

