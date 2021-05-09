import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            String s = pp.next();
            if(s.length()>10){
                String ans = "" +  s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1);
                System.out.println(ans);
            }
            else{
                System.out.println(s);
            }
            
        }
        pp.close();
    }
}