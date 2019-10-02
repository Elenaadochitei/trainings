package pack1;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int a = keyboard.nextInt();
        int i;
        int sw = 1;

        for (i = 2; i <= a-1; i++) {
            if (a % i == 0) {
                sw = 0;
                System.out.println(i);
                break;
            }
        }
        if (sw == 1) {
            System.out.println("numarul este prim");

        } else {
            System.out.println("numarul nu este prim");


        }

    }
}

