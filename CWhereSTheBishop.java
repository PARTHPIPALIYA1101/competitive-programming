import java.util.*;

public class CWhereSTheBishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            char[][] a = new char[8][8];
            for (int i = 0; i < 8; i++) a[i] = sc.next().toCharArray();
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if (a[i][j] == '#' &&
                        a[i - 1][j - 1] == '#' &&
                        a[i - 1][j + 1] == '#' &&
                        a[i + 1][j - 1] == '#' &&
                        a[i + 1][j + 1] == '#') {
                        System.out.println((i + 1) + " " + (j + 1));
                    }
                }
            }
        }
    }
}