import java.util.Scanner;

public class alcoholic {
    static Scanner pp = new Scanner(System.in);

    public static void main(String args[]){
        int n = pp.nextInt();
        int capacity = pp.nextInt();
        System.out.println(drunk(n, capacity));
    }

    static long drunk(int n, int capacity){
        long total = 0;
        capacity*=100;
        for(int i = 0;i<n;i++){
            int drink = pp.nextInt();
            int percent = pp.nextInt();
            total += drink*percent;
            if(total > capacity){
                return i+1;
            }
        }
        return -1;
    }
}