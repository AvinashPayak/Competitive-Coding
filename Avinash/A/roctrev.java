import java.util.Scanner;

class roctrev {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            int i = pp.nextInt();
            int j = pp.nextInt();
            long ways =1;
            for(int k =i;k<j;k++){
                if(arr[k] == 0 && k!=n-1){
                    System.out.println(0);
                    break;
                }
                if(arr[k]==0 && k == n-1) break;
                ways=(ways*arr[k])%1000000007;
            }
            System.out.println(ways);
        }
        pp.close();
    }
}

