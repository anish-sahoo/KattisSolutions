import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nothanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > list.get(i-1)+1){
                sum+= list.get(i);
            }
        }
        System.out.println(sum);
    }
}
