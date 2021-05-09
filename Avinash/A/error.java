import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner pp = new Scanner(System.in);
        int number = pp.nextInt();
        while(number != 42){
            System.out.println(number);
            number = pp.nextInt();
        }
        pp.close();
    }
}