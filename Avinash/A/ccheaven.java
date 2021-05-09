import java.util.*;
class ccheaven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            long l = sc.nextLong();
            sc.nextLine();
            String s = sc.nextLine();
            long good = 0, bad = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='1') good++;
                else bad++;
                if(good>=bad) {
                    flag = true;
                    break;
                }
            }
           
            if(flag) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}