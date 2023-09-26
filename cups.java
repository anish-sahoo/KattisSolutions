package kansas2.o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class cups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            int radius;
            String name;

            if(sc.hasNextInt()){
                radius = sc.nextInt()/2;
                name = sc.next();
            }
            else {
                name = sc.next();
                radius = sc.nextInt();
            }
            map.put(radius, name);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int key:list){
            System.out.println(map.get(key));
        }
    }
}
