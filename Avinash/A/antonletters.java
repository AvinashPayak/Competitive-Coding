import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            String s= pp.nextLine();
            s = s.substring(1,s.length()-1);
            s = s.replaceAll(", ", "");
            char[] arr = s.toCharArray();
            int[] lookup = new int[27];
            for(int i=0;i<s.length();i++){
                lookup[(arr[i]-96)]++;
            }
            int count = 0;
            for(int i=1;i<27;i++){
                if(lookup[i]>0){
                    count++;
                }
            }
            System.out.println(count);
        
        pp.close();
    }
}