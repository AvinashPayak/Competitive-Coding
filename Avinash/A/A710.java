import java.util.Scanner;

public class A710 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int k = pp.nextInt();
            String s = pp.next();
            int count = 0;
            int start = 0;
            int end = 0;
            for(int i=0;i<n;i++) {
                if(s.charAt(i) == '*') {
                    start = i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--) {
                if(s.charAt(i) == '*') {
                    end = i;
                    break;
                }
            }
           if(start == end) System.out.println(1);
           else System.out.println((end-start)/(k+1) + 2); 
        }
        pp.close();
    }
}
