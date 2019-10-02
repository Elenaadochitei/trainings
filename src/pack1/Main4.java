package pack1;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String p1="apa";
        String p2="lapte";

        String p3;
        p3=p1;
        System.out.println("aux ia valoare apa");
        p1=p2;
        System.out.println("p1 ia valoarea lapte");
        p2=p3;
        System.out.println("p2 ia valoare apa");

        System.out.println(p1);
        System.out.println(p2);
        }
    }

