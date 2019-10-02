package pack1;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int a = keyboard.nextInt();
        int inv=0;
        while (a != 0){
            inv = inv * 10 + a % 10;
            a = a/10;
        }
        System.out.println("suma este"+ inv);

    }
}