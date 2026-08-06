import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long s = sc.nextLong();
            if(s==0 || s == 1) System.out.println("0");
            else{
                int i=0;
                while(Math.pow(10,i) <= s){
                    i++;
                }
                long x=(long)Math.pow(10,i-1);
                System.out.println(s - x);
            }
        }
	}
}
