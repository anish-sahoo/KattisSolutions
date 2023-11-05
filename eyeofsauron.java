import java.util.*;

public class eyeofsauron{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.indexOf('(') == a.length()-a.indexOf(')')-1){
            System.out.println("correct");
        }
        else System.out.println("fix");
    }
}