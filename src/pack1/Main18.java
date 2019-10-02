package pack1;

import java.util.Scanner;

public class Main18 {

    private static int prod(int a, int b) {
        int p = a * b;
        return p;
    }

    private static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    private static int vect(int[] ve) {
        int suma = 0;
        for (int i = 0; i < ve.length; i++) {
            //suma += ve[i];

            // suma = suma + v[i];

            suma = sum(suma, ve[i]);
        }
        return suma;
    }

    private static int sum() {
        Scanner k = new Scanner(System.in);
        System.out.println("introduceti un numar");
        int n = k.nextInt();
        int[] v = new int[n];// = {0,0,0,0....0n}
        for (int i = 0; i < n; i++) {
            v[i] = k.nextInt();
        }
        return vect(v);
    }

    private static int[] sort() {
        Scanner k = new Scanner(System.in);
        System.out.println("introduceti un numar");
        int n = k.nextInt();
        int [] v1 = new int[n];
        for (int i = 0; i < n; i++){
            v1[i] = k.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (v1[i] > v1[j]) {
                    int aux = v1[i];
                    v1[i] = v1[j];
                    v1[j] = aux;
                }
            }
        }
        return v1;
    }
            public static void main (String[]args){
                int p = prod(5, 2);
                int p1 = prod(2, 2);
                int s = sum(p, prod(2, 2));

                System.out.println(p1);
                System.out.println(p);
                System.out.println(s);

                // int v[] = {2, 1, 3, 2};

                int[] v1 = sort();
                for (int i=0; i < v1.length ; i++){
                    System.out.println(v1[i]);
                }

            }
        }



