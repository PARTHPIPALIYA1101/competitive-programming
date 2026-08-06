import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            int fe = s.indexOf('8');
            if(fe != -1 &&(n-fe) >= 11){
                    System.out.println("YES");
                }
            else{
                System.out.println("NO");
            }
        }
	}
}