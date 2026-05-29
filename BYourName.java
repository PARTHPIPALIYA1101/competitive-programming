import java.util.*;

public class BYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            String s1=sc.next();
            int arr[]=new int[27];
            for(int i=0;i<n;i++){
                arr[s.charAt(i) - 'a']++;
                arr[s1.charAt(i) - 'a']--;
            }
            boolean flag = true;
            for(int i:arr){
                if(i != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}