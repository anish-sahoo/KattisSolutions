import java.util.ArrayList;
import java.util.Scanner;

public class cetvta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            list.add(l);
            list2.add(b);
        }
        for (int i = 0; i < 3; i++) {
            int a = list.get(i);
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if(list.get(j) == a){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a+" ");
            }
        }

        for (int i = 0; i < 3; i++) {
            int a = list2.get(i);
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if(list2.get(j) == a){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(a);
            }
        }
    }
}
