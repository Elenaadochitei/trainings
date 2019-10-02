package pack1;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int a = keyboard.nextInt();
        int suma=0;
        while (a != 0){
            suma += a % 10;
            a = a/10;
        }
        System.out.println("suma este"+ suma);

    }
}