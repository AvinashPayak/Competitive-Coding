import java.util.*;
class specialcards {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int R = 0;//1 
        int B = 0;//1
        int r = 0;//1
        int b = 0;
        int chance = 0;
        for(int i=0;i<n;i++){
            System.out.println(chance);
            String  s = pp.next();
            int ri = pp.nextInt();
            int bi = pp.nextInt();
            if((R+r)>= ri && (B+b)>=bi){
                chance++;
                b = b - (bi-B);
                r = r - (ri - R);
                if(s.charAt(0)  == 'R') R++;
                else B++;
                continue;
            }
            else{
                if((r+R)<ri || (b +B)< bi){
                    int breq = bi-b-B;
                    int rreq = ri-r-R;
                    if(breq >=0 || rreq >= 0){
                        chance+=Math.max(breq, rreq);
                        r += Math.max(breq, rreq);
                        b +=Math.max(breq, rreq); 
                    }
                    
                }
            }
            
            r=r-ri+R;
            b =b-bi+B;
            chance++;
            if(s.charAt(0)  == 'R') R++;
            else B++;
        }
        System.out.println(chance);
        pp.close();
    }
}