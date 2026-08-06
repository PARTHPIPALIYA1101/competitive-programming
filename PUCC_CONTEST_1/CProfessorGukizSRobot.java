import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result = Math.max(Math.abs(a - x), Math.abs(b - y));
        System.out.println(result);
	}
}