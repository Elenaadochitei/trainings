package pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int suma=0;
        while (true) {
            System.out.println("introduce un numar");
            int numar = keyboard.nextInt();
            if(numar == 0){
                break;
            }
            suma=suma+numar;
    }
        System.out.println("suma este " + suma );
    }

}
