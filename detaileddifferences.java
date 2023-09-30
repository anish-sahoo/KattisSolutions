import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(a+"\n"+b);
            for (int j = 0; j < a.length(); j++) {
                System.out.print(a.charAt(j)==b.charAt(j)?".":"*");
            }
            System.out.println("\n");
        }
    }
}
