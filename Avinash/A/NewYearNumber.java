import java.util.Scanner;
public class NewYearNumber {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            if(NY(n) == true) System.out.println("YES");
            else System.out.println("NO");
            
        }
        pp.close();
    }

    static boolean NY(int n){
        if(n%2020 == 0) return true;
        if(n%2021 ==0) return true;
        int multiples = n/2020;
        int ans =2020*multiples;
        while(multiples > 0){
            if(ans == n) return true;
            if(ans < n) ans++;
            multiples--;
        }
        return false;
    }
}