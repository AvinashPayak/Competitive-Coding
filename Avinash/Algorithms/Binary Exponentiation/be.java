import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner pp = new Scanner(System.in);
        int a = pp.nextInt();
        int b = pp.nextInt();
        System.out.println(power(a, b));
        pp.close();
    }
    static int power(int a, int b){
        int result = 1;
        while(b>0){
            if(b%2 ==1) result *=a;
            a *=a;
            b /=2;
        }
        return result;
    }
}