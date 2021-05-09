import java.util.Scanner;

public class cf700B {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        for(int t = 0;t<n;t++){
            int hp = pp.nextInt();
            int hh = pp.nextInt();
            int monsters = pp.nextInt();
            int[] mps = new int[monsters];
            int[] mhs = new int[monsters];
            for(int i=0;i<monsters;i++) mps[i] = pp.nextInt();
            for(int i=0;i<monsters;i++) mhs[i] = pp.nextInt();
            kill(hp,hh,monsters,mps,mhs);          
        }
        pp.close();
    }

    static void kill(int hp, int hh,int monsters, int[] mps, int[] mhs){
        long damage = 0;
        for(int i=0;i<monsters;i++) damage+= (long)(mhs[i]+hp-1)/hp*mps[i];
        for(int i=0;i<monsters;i++) if(hh-(damage-mps[i])>0) {
            System.out.println("YES");
            return;
        } 
        System.out.println("NO");
        return;
    }
}

