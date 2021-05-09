import java.util.Scanner;

class nezarlucky {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int k = pp.nextInt();
            long[] arr = new long[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                System.out.println(lucky(arr[i],k));
            }
        }
        pp.close();
    }
    static String lucky(long number, int k){
        if(number>=k*10) return "YES";
        while(number >=k){
            if(number%k == 0) return "YES";
            number-=10;
        }
        return "NO";
        }
}

