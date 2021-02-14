import java.util.Scanner;

public class cf700A {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        for(int i = 0;i<n;i++){
            String s = pp.next();
            String ans = "";
            for(int j=0;j<s.length();j++){
                if(j%2==0){
                    if(s.charAt(j) == 'a') ans+="b";
                    else ans+="a";
                }
                else{
                    if(s.charAt(j) == 'z') ans+="y";
                    else ans+="z";
                }
            }
            System.out.println(ans);
        }
        
        pp.close();
    }
}

