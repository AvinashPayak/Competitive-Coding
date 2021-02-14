import java.util.Scanner;

public class slot {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String s = pp.next();
        boolean flag = false;
        flag = (s.charAt(0) == s.charAt(1))? ((s.charAt(1) == s.charAt(2))? true : false): false;
        if(flag == true) System.out.println("Won");
        else System.out.println("Lost");
        pp.close();
    }
}