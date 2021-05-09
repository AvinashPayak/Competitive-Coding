import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int s = pp.nextInt();
        int t = pp.nextInt();
        int kirito = s;
        int dragon = 0;
        int min = Integer.MAX_VALUE;
        for(int T = 0;T<t;T++){
            int d = pp.nextInt();
            dragon = Math.max(d,dragon);
            int  k = pp.nextInt();
            min = Math.min(min,k);
            kirito +=k;
        }
        if((kirito-min)>dragon){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        pp.close();
    }
}