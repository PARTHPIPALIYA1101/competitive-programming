import java.util.*;

public class ABachgoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ls=new ArrayList<>();
        if(n%2 == 1){
            for(int i=0;i<((n-1) /2 )-1;i++){
                ls.add(2);
            }
            ls.add(3);
        }
        else{
            for(int i=0;i<(n /2 );i++){
                ls.add(2);
            }
        }
        if(n==3){
            System.out.println("1");
            System.out.println("3");
        }
        else{
            System.out.println(ls.size());
            for(int i:ls)System.out.print(i + " ");
            System.out.println();
        }
    }
}