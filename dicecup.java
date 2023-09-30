import java.util.Arrays;
import java.util.Scanner;

public class dicecup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] s = new int[m+n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i+j]++;
            }
        }
        int[] a2 = s.clone();
        Arrays.sort(a2);

        for (int i = 0; i < s.length; i++) {
            if (s[i] == a2[m+n]) {
                System.out.println(i);
            }
        }
    }
}
