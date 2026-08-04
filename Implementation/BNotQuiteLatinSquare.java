import java.util.*;

public class BNotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int arr[]=new int[3];
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next();
            for(int i=0;i<3;i++){
                if(s1.charAt(i) != '?')arr[s1.charAt(i)-'A']++;
                if(s2.charAt(i) != '?')arr[s2.charAt(i)-'A']++;
                if(s3.charAt(i) != '?')arr[s3.charAt(i)-'A']++;
            }
            for(int i=0;i<3;i++){
                if(arr[i] == 2) System.out.println((char)('A' + i));
            }
        }
    }
}