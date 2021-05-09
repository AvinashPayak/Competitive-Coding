import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int m = pp.nextInt();
            int a = pp.nextInt();
            int b = pp.nextInt();

            int allb = n%m==0? (n/m)*b:((n/m)+1)*b;
            int alla = n*a;
            int optimala = (n/m)*b + (n%m)*a;
            int min = (allb>=alla)? ((alla>=optimala)?optimala:alla): ((allb>=optimala)?optimala:allb);
            System.out.println(min);
        
        pp.close();
    }
}