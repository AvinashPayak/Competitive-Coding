import java.util.Scanner;

public class futurepuzzle {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            String b1 = pp.next();
            System.out.println(ans(b1,n));
            
        }
        pp.close();
    }

    static String ans(String b1, int n){
        if(n == 1) return "1";
        String b2 = "";
        int last = 0;
    
        
        for(int i = 0;i<n;i++){
             if(b1.charAt(i) == '0' && last !=1){
                 b2+="1";
                 last = 2;
             }
             else if(b1.charAt(i) == '0'){
                 b2+="0";
                 last = 0;
             }
             else if(b1.charAt(i) == '1' && last !=2){
                 b2+="1";
                 last =2;
             }
             else{
                 b2+="0";
                 last = 1;
             }
        }
        return b2;
    }
}