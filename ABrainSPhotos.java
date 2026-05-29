import java.util.*;

public class ABrainSPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int x=sc.nextInt();
        boolean flag=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<x;j++){
                char c=sc.next().charAt(0);
                if(c=='C' || c=='M' || c=='Y') flag=false;
            }
        }
        if(flag) System.out.println("#Black&White");
        else System.out.println("#Color");
    }
}