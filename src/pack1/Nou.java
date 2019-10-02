package pack1;

public class Nou {
    public static void main(String[] args) {
        Student2 s=new Student2();

        s.metoda();
        s.metoda1();

        Student2 s2=new Student2();

        s2.metoda2();
        s.metoda3("Ana");
        s.metoda4("Elena");
        s2.metoda3("Ion");
        s2.metoda4("Costel");

        s.afisare();
        s2.afisare1();

        System.out.println();
        s2.afisare();
        s.afisare1();

        Student2 s3=new Student2();

        s3.metoda3(s2.expunerexyz());
        s3.metoda4(s.expunerexxx());

         String ss = s.expunerexxx();


        System.out.println(s.expunerexxx());

    }
}
