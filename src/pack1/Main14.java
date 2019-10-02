package pack1;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int n = 6;
        int i = 0;
        int v[] = new int[n];
        while (i < n) {
            v[i] = keyboard.nextInt();
            i++;
        }
        i = 0;
        int sum = 0;
        while (i < n) {
            if (v[i] % 2 == 0) {
                System.out.println(v[i]);
                sum += v[i];
            }
            i++;
        }
        System.out.println("suma este" + " " + sum);
        i = 0;
        int prod = 1;
        while (i < n) {
            if (v[i] % 2 != 0) {
                System.out.println(v[i]);
                prod *= v[i];
            }
            i++;
        }
            System.out.println("produsul este" + " " + prod);
        }
    }
