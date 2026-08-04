import java.util.*;

public class Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> feq=new HashMap<>();
            int mfeq=0;
            for(int i=0;i<n;i++){
                int z=sc.nextInt();
                feq.put(z,feq.getOrDefault(z,0)+1);
                mfeq=Math.max(mfeq,feq.get(z));
            }
            System.out.println(n-mfeq+1);
        }
    }
}