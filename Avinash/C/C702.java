import java.util.*;

public class C702 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            long n = pp.nextLong();
            boolean flag = false;
            for(long i=1;i*i*i<n;i++){
                long b3 = n - i*i*i;
                long b = (long)Math.round(Math.pow(b3, 1.0/3));
                if(b> 0 && b3 == b*b*b) {
                    flag = true;
                    break;
                }
            }
        if(flag == true) System.out.println("YES");
        else System.out.println("NO");
    }  
        pp.close();
    }
}

