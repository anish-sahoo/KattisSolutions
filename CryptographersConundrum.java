import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != "PER".charAt(i%3))
                count++;
        }
        System.out.println(count);
    }
}