import java.util.*;
class ashsort {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        long ans[] = new long[n];
        long swim[] = new long[n];
        long run[] = new long[n];
        long totalMin = Long.MAX_VALUE;
        long swimMin = Long.MAX_VALUE;
        long runMin = Long.MAX_VALUE;
        long totalMax = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            int s = pp.nextInt();
            int r = pp.nextInt();
            swim[i] = s;
            run[i] = r;
            ans[i] = s + r;
            if(s<swimMin) swimMin = s;
            if(r<runMin) runMin = r;
            if(ans[i]>totalMax) totalMax = ans[i];
            if(ans[i] < totalMin) totalMin = ans[i];
        }
        for(int i=0;i<n;i++){
            if((float)ans[i]/2 >= (float)totalMax/2) System.out.print(i+1 + " ");
        }
        pp.close();
    }
}