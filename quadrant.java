import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        if(x>0 && y>0){
            System.out.println(1);
        }
        else if(x>0 && y<0){
            System.out.println(4);
        }
        else if(x<0 && y<0){
            System.out.println(3);
        }
        else System.out.println(2);

    }
}
