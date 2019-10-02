package pack2;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("introduce nume figura");
            String figura = keyboard.next();
            if ("patrat".equals(figura)) {
                while (true) {
                    System.out.println("introduce latura");
                    int latura = keyboard.nextInt();
                    if (latura > 0) {
                        System.out.println("aria este" + latura * latura);
                        System.out.println("Perimetrul este" + 4 * latura);
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }
            } else if ("dreptunghi".equals(figura)) {
                int lungime = 0;
                int latime = 0;
                while (true) {
                    System.out.println("introduce lungime");
                    lungime = keyboard.nextInt();
                    if (lungime > 0) {
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }
                while (true) {
                    System.out.println("introduce latime");
                    latime = keyboard.nextInt();
                    if (latime > 0) {
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }System.out.println("aria este" + lungime*latime);

            } else if ("triunghi".equals(figura)) {
                int latura1 = 0;
                int latura2 = 0;
                int latura3 = 0;
                while (true) {
                    System.out.println("introduce latura1");
                    latura1 = keyboard.nextInt();
                    if (latura1 > 0) {
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }
                while (true) {
                    System.out.println("introduce latura2");
                    latura2 = keyboard.nextInt();
                    if (latura2 > 0) {
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }
                while (true) {
                    System.out.println("introduce latura3");
                    latura3 = keyboard.nextInt();
                    if (latura3 > 0) {
                        break;
                    } else {
                        System.out.println("latura este gresita");
                    }
                }
                {
                    System.out.println("aria este" + latura1 * latura2 * latura3);
            }
        } else if ("exit".equals(figura)) {
            break;
        } else {
            System.out.println("figura incorecta");
        }
    }
    }
}

