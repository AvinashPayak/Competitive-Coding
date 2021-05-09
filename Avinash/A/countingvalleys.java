import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            String s = pp.next();
            int count = 0;
            int valley = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i) == 'U'){
                    count++;
                }
                else {
                    count--;
                }
                if((i !=0) && (count == 0) && (s.charAt(i) == 'U')){
                    valley++;
                }
            }
            System.out.println(valley);
        pp.close();
    }

}