package pack1;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       int prod=1;
       int sum=0;
       while(true){
           int i = keyboard.nextInt();
           if(i==0){
               break;
           }
           if(i<0){
               sum += i;
               System.out.println("suma este " + sum);
           }else {
               prod *= i;
               System.out.println("produsul este " + prod);
           }
       }
    }
}
