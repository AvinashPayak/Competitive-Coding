import java.util.Scanner;

class A703 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            long sum = 0;
            boolean flag = true;
            for(int i = 0;i<n;i++){
                sum+= pp.nextLong();
                if(2*sum<(i)*(i+1)) {flag = false; break;}
            }
            if(flag == true) System.out.println("YES");
            else System.out.println("NO");
        }     
        pp.close();
    }
}

