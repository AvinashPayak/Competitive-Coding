import java.util.*;
class ptuples {
    public static void main(String[] args){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n= pp.nextInt();
            int ar[] = new int[n+1];
            for(int i = 2; i*i<=n;i++){
                if(ar[i] == 0){
                    for(int j = i;j*i<=n;j++){
                        ar[j*i] = 1;
                    }
                }
            }
            int count = 0;
            for(int i=2;i<=n;i++){
                if(ar[i] == 0){
                    ar[i-2] == 0
                }
            }
            System.out.println(count);
        }
        pp.close();
    }
}
