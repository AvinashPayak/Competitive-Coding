import java.util.*;

class rocsad {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] set = new int[2*n];
            for(int i = 0;i<n;i++) {
                set[i] = pp.nextInt();
                set[i] = Math.abs(set[i]);
            }
            for(int i=0;i<n;i++) {
                set[i+n] = pp.nextInt();
                set[i+n] = Math.abs(set[i+n]);
            }
                Arrays.sort(set);
            int min = Integer.MAX_VALUE;
            for(int i=0;i<2*n-1;i++){
                if(Math.abs(Math.abs(set[i])-Math.abs(set[i+1]))<min) min = Math.abs(Math.abs(set[i])-Math.abs(set[i+1]));
            }
            System.out.println(min);
            
        }
        pp.close();
    }
}

