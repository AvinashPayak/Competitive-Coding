import java.util.*;

class magicwell {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        while(t !=0){
            int n = pp.nextInt();
            int sum = n*(n+1)*(2*n+1)/6;
            System.out.println(sum);
            t--;
        }
        pp.close();
    }
    static int power_optimized(int a, int n){
        int ans = 1;
        while(n>0){
            int last_bit = (n&1);
            if(last_bit == 1) ans *=a;
            a = a*a;
            n = n>>1;
        }
        return ans;
    } 
}