import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = Integer.parseInt(pp.nextLine());
        for(int T = 0;T<t;T++){
            String str = pp.nextLine();
            if((str.contains("not") && str.length()==3) || (str.contains(" not ")) || (str.contains(" not") && str.indexOf("not") == (str.length()-3)) || (str.contains("not ") && str.indexOf("not ") == 0)){
                System.out.println("Real Fancy");
            }
            else{
                System.out.println("regularly fancy");
            }        
        }
        pp.close();
    }
}