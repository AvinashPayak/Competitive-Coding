import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int x = pp.nextInt();
            int y =pp.nextInt();

            if(Math.abs(x-y)<=0){
                System.out.println(x+y);
            }
            else{
                int min = Math.min(x,y);
                int diff = Math.max(x,y) - min;
                System.out.println(min*2 + diff*2 -1); 
            }
        }
        pp.close();
    }
}