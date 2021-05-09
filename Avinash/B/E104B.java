import java.util.Scanner;

public class E104B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
			int k = pp.nextInt();
			int mid = n/2;
			int pos = n%2==0?k:k%mid==0?k+(k/mid)-1:k+(k/mid);
			System.out.println(pos%n == 0?n:pos%n);
        }
        pp.close();
    }
}

