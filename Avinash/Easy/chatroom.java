import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String s = pp.next();
        String ans = "hello";
        String str = "";
        int pt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ans.charAt(pt)){
                pt++;
            }
            if(pt == 5){
                System.out.println("YES");
                System.exit(0);
            }
        }
            System.out.println("NO");
        pp.close();
    }
}