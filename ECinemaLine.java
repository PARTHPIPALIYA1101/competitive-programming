import java.util.*;

public class ECinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        boolean flag = true;
        int t25=0;
        int t50=0;
        while(t-- >0){
            int a=sc.nextInt();
            if(a == 25){
                t25++;
            }
            if(a == 50){
                if(t25 >= 1){
                    t25--;
                    t50++;
                }else{
                    flag = false;
                    break;
                }
            }
            if(a == 100){
                if(t50 >= 1 && t25 >= 1){
                    t50--;
                    t25--;
                }else if(t50 == 0 && t25 >= 3){
                    t25-=3;
                }
                else{
                    flag = false;
                    break;
                }
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}