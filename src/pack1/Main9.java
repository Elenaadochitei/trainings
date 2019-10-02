package pack1;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un numar");
        int n=6;
        int i=0;
        int v [ ]= new int [n];

        while (i<n){
            v[i]= keyboard.nextInt();
            i++;
        }
        i=0;
        while (i<n){
                System.out.print (v[i] + " ");
                i++;
        }
        //facem suma elementelor
        i=0;
        int sum = 0;
        while (i<n){
            sum += v[i];
            i++;
        }
        System.out.println("suma este" + " " + sum);

        //afisam invers

        i=n-1; // i este n - 1 ->  punem i pt pozitia de start/de plecare
        while(i>=0){ // i este mai mare egal cu 0
            System.out.println(v[i]); // citeste de la tastatura vectorul i
            i--; // ia in minus cu o valoare
        }



    }
}
