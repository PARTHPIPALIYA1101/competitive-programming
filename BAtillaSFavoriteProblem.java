import java.util.*;

public class BAtillaSFavoriteProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s = sc.next();
            int arr[]=new int[27];;
            for(int i=0;i<n;i++) arr[s.charAt(i) - 'a']++;
            for(int i=26;i>=0;i--){
                if(arr[i] != 0) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}