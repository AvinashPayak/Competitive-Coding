import java.util.*;

public class B550 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            long sum = 0;
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            for(int i=0;i<n;i++){
                int temp = pp.nextInt();
                if(temp%2 ==0) even.add(temp);
                else odd.add(temp);
                sum+=temp;
            }
            Collections.sort(even);
            Collections.sort(odd);
            int min = Math.min(even.size(),odd.size());
            if(odd.size() == even.size() || odd.size() == even.size() + 1 || even.size() == odd.size() + 1) System.out.println(0);
            else {
                int temp = min;
                int e = even.size() -1;
                int o = odd.size() - 1;
                while(temp!=0){
                    sum-= (even.get(e) + odd.get(o));
                    temp--;
                    o--;
                    e--;
                }
                if(min == odd.size()) sum-=even.get(e);
                else sum-=odd.get(o);

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

