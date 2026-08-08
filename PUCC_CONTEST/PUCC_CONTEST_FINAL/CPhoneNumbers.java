import java.util.*;
import java.lang.*;
import java.io.*;
 
public class CPhoneNumbers{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        LinkedHashMap<String , int[]> m=new LinkedHashMap<>();
        while(t-- > 0){
            int n=sc.nextInt();
            String name=sc.next();
            int arr[]=new int[3];
            m.put(name,arr);
            for(int i=0;i<n;i++){
                String sss=sc.next();
                int p=x(sss);
                arr[p]++;
                m.put(name,arr);
            }
        }
        ArrayList<String> taxi=new ArrayList<>();
        ArrayList<String> pizza=new ArrayList<>();
        ArrayList<String> girl=new ArrayList<>();
        int max=0;
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[0] > max){
                max=arr[0];
            }
        }
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[0] == max){
                taxi.add(s);
            }
        }
        max=0;
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[1] > max){
                max=arr[1];
            }
        }
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[1] == max){
                pizza.add(s);
            }
        }
        max=0;
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[2] > max){
                max=arr[2];
            }
        }
        for(String s:m.keySet()){
            int arr[]=m.get(s);
            if(arr[2] == max){
                girl.add(s);
            }
        }
        System.out.print("If you want to call a taxi, you should call: ");
        for(int i=0;i<taxi.size()-1;i++){
            System.out.print(taxi.get(i)+", ");
        }
        System.out.print(taxi.get(taxi.size()-1)+".");
        System.out.println();
        System.out.print("If you want to order a pizza, you should call: ");
        for(int i=0;i<pizza.size()-1;i++){
            System.out.print(pizza.get(i)+", ");
        }
        System.out.print(pizza.get(pizza.size()-1)+".");
        System.out.println();
        System.out.print("If you want to go to a cafe with a wonderful girl, you should call: ");
        for(int i=0;i<girl.size()-1;i++){
            System.out.print(girl.get(i)+", ");
        }
        System.out.print(girl.get(girl.size()-1)+".");
        System.out.println();
	}
	public static int x(String p){
	    boolean ok=true;
	    for(int i=1;i<8;i++){
	        if(i == 2 || i == 5) continue;
	        if(p.charAt(0) != p.charAt(i)){
	            ok=false;
	        }
	    }
	    if(ok) return 0;
	    ok = true;
	   // for(int i=1;i<8;i++){
	   //     if(i == 2 || i == 5) continue;
	   //     int a=p.charAt(i-1)-'0';
	   //     int b=p.charAt(i)-'0';
	   //     if(a <= b){
	   //         ok=false;
	   //     }
	   // }
	   if(p.charAt(0)-'0' <= p.charAt(1)-'0') ok = false;
	   if(p.charAt(1)-'0' <= p.charAt(3)-'0') ok = false;
	   if(p.charAt(3)-'0' <= p.charAt(4)-'0') ok = false;
	   if(p.charAt(4)-'0' <= p.charAt(6)-'0') ok = false;
	   if(p.charAt(6)-'0' <= p.charAt(7)-'0') ok = false;
	    if(ok) return 1;
	    return 2;
	}
}