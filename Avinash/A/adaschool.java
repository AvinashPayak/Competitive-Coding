import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int r = pp.nextInt();
            int c = pp.nextInt();
            if(r%2 !=0 && c%2!=0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        pp.close();
    }
}