
import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            long sum=0;
            int three = (n-1)/3;
            int five = (n-1)/5;
            int fifteen = (n-1)/15;
            sum = 3*(three*(three+1)/2) + 5*(five*(five+1)/2) - 15*(fifteen*(fifteen+1)/2);
            System.out.println(sum);
        }
        pp.close();
    }
}