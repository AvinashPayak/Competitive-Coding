import java.util.*;
class passwd {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        for(int i=0;i<n;i++){
           String s = pp.next();
           System.out.println(valid(s));
        }
        pp.close();
    }

    static String valid(String s){
        if(s.length()<10) return "NO";
        boolean special = false;
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        String lowerAlpha = "abcdefghijklmnopqrstuvwxyz";
        String upperAlpha = lowerAlpha.toUpperCase();
        String digits = "0123456789";
        String specials = "@#%&?";
        if(lowerAlpha.contains(s.charAt(0)+"") == true || lowerAlpha.contains(s.charAt(s.length()-1) + "")) lower = true;
        for(int i=1;i<s.length()-1;i++){
            if(specials.contains(s.charAt(i)+"") == true) special = true;
            if(digits.contains(s.charAt(i)+"") == true) digit = true;
            if(upperAlpha.contains(s.charAt(i)+"")) upper = true;
            if(lowerAlpha.contains(s.charAt(i)+"") == true) lower = true; 
        }
        if(upper == true
         && lower == true
         && special == true
         && digit == true) return "YES";
         else return "NO";

    }
}