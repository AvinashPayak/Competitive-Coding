import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String str = pp.next();
        String ans = "";
        for(int i=0;i<str.length();i++){
            str = str.toLowerCase();
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y'){
                ans +="";
            }
            else{
                ans+="." + str.charAt(i);
            }
        }
        System.out.println(ans);
        
        pp.close();
    }

}