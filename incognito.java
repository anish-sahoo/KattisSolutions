import java.util.HashMap;
import java.util.Scanner;

public class incognito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            sc.nextLine();
            HashMap<String, Integer> set = new HashMap<>();
            for (int j = 0; j < b; j++) {
                String item = sc.next();
                String type = sc.next();
                if(!set.containsKey(type)){
                    set.put(type,1);
                }
                else set.put(type, set.get(type)+1);
            }
            int pro = 1;
            for(int value:set.values()){
                pro *= value+1;
            }
            System.out.println(pro-1);
        }

    }
}
