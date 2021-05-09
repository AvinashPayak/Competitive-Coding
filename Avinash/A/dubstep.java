import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("WUB");
        for(String x:s)
            System.out.print(x+" ");
        sc.close();
    }
}