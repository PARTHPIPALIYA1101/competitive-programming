import java.util.*;

public class ARiptide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- >0){
            int[] tokens = new int[3];
            tokens[0] = scanner.nextInt();
            tokens[1] = scanner.nextInt();
            tokens[2] = scanner.nextInt();
            
            int rounds = 0;
            while (true) {
                if (tokens[0] == tokens[1] || tokens[1] == tokens[2] || tokens[0] == tokens[2]) {
                    break;
                }
                Arrays.sort(tokens);
                tokens[2]--;
                tokens[0]++;
                rounds++;
            }
            System.out.println(rounds);
        }
    }
}