import java.util.*;

public class ABoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String n = sc.next();
            int count = (n.charAt(0) - '0' - 1) * 10;
            count += switch (n.length()) {
                case 1 -> 1;
                case 2 -> 3;
                case 3 -> 6;
                case 4 -> 10;
                default -> 0;
            };
            System.out.println(count);
        }
    }
}