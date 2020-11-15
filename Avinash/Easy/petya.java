import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String str1 = pp.next();
        String str2 = pp.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int ans = 0;
        for(int i=0;i<str1.length();i++){
            if(Character.valueOf(str1.charAt(i)).compareTo(Character.valueOf(str2.charAt(i))) > 0){
                ans = 1;
                break;
            }
            else if(Character.valueOf(str1.charAt(i)).compareTo(Character.valueOf(str2.charAt(i))) < 0){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
        pp.close();
    }
}