import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B587 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            HashMap<Integer,Integer> hs = new HashMap<>();
            for(int i=0;i<n;i++){
                int x = pp.nextInt();
                hs.put(i+1, x);
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hs.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
                public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer,Integer> e2) {
                    return e2.getValue()-e1.getValue();
                }
            });
            int sum = 0;
            int i = 0;
            for(Map.Entry<Integer, Integer> e: list){
                sum += i*e.getValue() + 1;
                i++; 
            }
            System.out.println(sum);
            for(Map.Entry<Integer, Integer> e: list){
                System.out.print(e.getKey() + " ");
            }

        
        pp.close();
    }

    static short countBits(int n){
        short count = 0;
        while(n!=0){
            count+=(n & 1);
            n >>>= 1;
        }
        return count;
    }

    static short parity(int n){
        short result = 0;
        while(n!=0){
            result ^= 1;
            n &= n-1;
        }
        return result;
    }

    static long swapBits(long n, int i, int j){
        if(((n >>> i) & 1) != ((n >>> j) & 1)){
            long bitMask = ((1L << i) | (1L << j));
            n ^= bitMask;
        }
        return n;
    }
}

