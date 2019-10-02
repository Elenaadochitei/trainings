package pack1;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int a = keyboard.nextInt();

        for (int i = 2; i < 10; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}