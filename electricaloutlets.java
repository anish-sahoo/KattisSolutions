import java.util.ArrayList;
import java.util.Scanner;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            int sum=0;

            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j)-1;
            }
            System.out.println(sum+1);
        }
    }
}
