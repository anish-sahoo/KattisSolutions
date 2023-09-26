import java.util.Scanner;

public class turtlemaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[8][8];
        Turtle obj = new Turtle();
        turtlemaster o = new turtlemaster();
        for (int i = 0; i < 8; i++) {
            matrix[i] = sc.nextLine().split("");
        }
        String line = sc.nextLine();
        int[] d_pos = {-1,-1};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(matrix[i][j].equals("D")){
                    d_pos = new int[]{i, j};
                }
            }
        }
        for(char c:line.toCharArray()){
            switch (c){
                case 'F':
                    obj.position = o.update(obj.position, obj.direction);
                    if(obj.position[0] > 7 || obj.position[0] < 0
                    || obj.position[1] > 7 || obj.position[1] < 0){
                        System.out.println("Bug!");
                        System.exit(0);
                    }
                    if(matrix[obj.position[0]][obj.position[1]].equals("I") ||
                            matrix[obj.position[0]][obj.position[1]].equals("C") ){
                        System.out.println("Bug!");
                        System.exit(0);
                    }
                    else{
                        matrix[obj.position[0]][obj.position[1]] = "T";
                        matrix[obj.position[0]-obj.direction[0]]
                                [obj.position[1]-obj.direction[1]] = ".";
                    }
                    break;
                case 'R':
                    if (obj.direction[0] == 0 && obj.direction[1] == 1) {
                        obj.direction = new int[]{1,0};
                    }
                    else if (obj.direction[0] == 1 && obj.direction[1] == 0) {
                        obj.direction = new int[]{0,-1};
                    }
                    else if (obj.direction[0] == 0 && obj.direction[1] == -1) {
                        obj.direction = new int[]{-1,0};
                    }
                    else if (obj.direction[0] == -1 && obj.direction[1] == 0) {
                        obj.direction = new int[]{0,1};
                    }
                    break;
                case 'L':
                    if (obj.direction[0] == 1 && obj.direction[1] == 0) {
                        obj.direction = new int[]{0,1};
                    }
                    else if (obj.direction[0] == 0 && obj.direction[1] == -1) {
                        obj.direction = new int[]{1,0};
                    }
                    else if (obj.direction[0] == -1 && obj.direction[1] == 0) {
                        obj.direction = new int[]{0,-1};
                    }
                    else if (obj.direction[0] == 0 && obj.direction[1] == 1) {
                        obj.direction = new int[]{-1,0};
                    }
                    break;
                case 'X':
                    int[] z = o.update(obj.direction, obj.position);
                    if(matrix[z[0]][z[1]].equals("I")){
                        matrix[z[0]][z[1]] = ".";
                    }
                    else {
                        System.out.println("Bug!");
                        System.exit(0);
                    }
                    break;
            }
        }
        if(obj.position[0] == d_pos[0] && obj.position[1] == d_pos[1] ){
            System.out.println("Diamond!");
        }
        else System.out.println("Bug!");
    }
    static class Turtle{
        int[] position = {7,0};
        int[] direction = {0,1};
    }
    int[] update(int[] a, int[] b){
        return new int[]{a[0]+b[0], a[1]+b[1]};
    }
}
