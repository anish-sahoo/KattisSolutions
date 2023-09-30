import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArmyStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            sc.nextLine();
            int godzillaSize = sc.nextInt();
            int mechaSize = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> godzillaArmy = new ArrayList<>();
            ArrayList<Integer> mechaArmy = new ArrayList<>();

            for (int j = 0; j < godzillaSize; j++) {
                godzillaArmy.add(sc.nextInt());
            }
            sc.nextLine();
            for (int j = 0; j < mechaSize; j++) {
                mechaArmy.add(sc.nextInt());
            }
            sc.nextLine();

            Collections.sort(godzillaArmy);
            Collections.sort(mechaArmy);
            int z = 0;

            while (!godzillaArmy.isEmpty() || !mechaArmy.isEmpty()){
                if(godzillaArmy.isEmpty()){
                    System.out.println("MechaGodzilla");
                    z++;
                    break;
                }
                if(mechaArmy.isEmpty()){
                    System.out.println("Godzilla");
                    z++;
                    break;
                }

                int m_weakest = mechaArmy.get(0);
                int g_weakest = godzillaArmy.get(0);

                if(g_weakest < m_weakest){
                    godzillaArmy.remove(0);
                }
                else {
                    mechaArmy.remove(0);
                }
            }

            if(z == 0){
                System.out.println("uncertain");
            }
        }
    }
}
