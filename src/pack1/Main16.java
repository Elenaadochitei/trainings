package pack1;

import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        Biblioteca xxx = new Biblioteca();

        Carte mate = new Carte();
        mate.setTitlu("Mate");
        mate.setAutor("Mihai Eminescu");

        Carte romana = new Carte();
        romana.setTitlu("Romana");
        romana.setAutor("Ion Creanga");

        Carte info = new Carte();
        info.setTitlu("Info");
        info.setAutor("Vacariu Ionut");

        Carte[] carti = {mate, romana, info };
        xxx.setCarte(carti);


        xxx.afisare();
        xxx.sortare();



    }
}
