import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String str = pp.next();
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for(int i=0;i<str.length();i = i + 2){
            if((str.charAt(i) - '0') == 1){
                ones++;
            }
            else if((str.charAt(i) - '0') == 2){
                twos++;
            }
            else{
                threes++;
            }
        }
        String ans = "";
        int n = str.length()/2;
       while(ones!=0 || twos!=0 || threes!=0){
           if(ones != 0){
            if(n!=0){
                ans+="1+";
                ones--;
            }
            else{
                ans+="1";
                ones--;
            }
           }
           else if(twos !=0){
                if(n!=0){
                    ans+="2+";
                    twos--;
                }
                else{
                    ans+="2";
                    twos--;
                }
           }
           else if(threes !=0){
               if(n!=0){
                ans+="3+";
                threes--;
               }
               else{
                ans+="3";
                threes--;
               }
           }
           n--;


       }
        System.out.println(ans);

        pp.close();
    }

}