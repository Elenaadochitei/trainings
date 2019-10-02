package pack1;

public class Main17 {

    public static void main(String[] args) {
        Student elena = new Student();
        elena.setNume("Elena");
        elena.setPrenume("Adochitei");
        int[] noteElena = {2, 5, 7, 5};
        elena.setNote(noteElena);

        Student andrei = new Student();
        andrei.setNume("Andrei");
        andrei.setPrenume("Vacariu");
        int[] noteAndrei = {2, 5, 7, 10};
        andrei.setNote(noteAndrei);

        Student[] students = {elena, andrei};
        Catalog catalog = new Catalog();
        catalog.setClasa("12D");
        catalog.setStudents(students);

        Student costel = new Student();
        costel.setNume("Costel");
        costel.setPrenume("Adochitei");
        int[] noteCostel = {4, 5, 4, 5};
        costel.setNote(noteCostel);

        Student costy = new Student();

        costy.setNume("Azz123123");
        costy.setNume("Costy");
        costy.setPrenume("Baltag");
        int[] noteCosty = {2, 8, 7, 5};
        costy.setNote(noteCosty);

        Student[] students1 = {costel, costy};
        Catalog catalog1 = new Catalog();
        catalog1.setClasa("11D");
        catalog1.setStudents(students1);

        System.out.println("AICI INCEPE");
        listStuds(catalog);
        listStuds(catalog1);

        System.out.println("Transfer");
        catalog.transfer(catalog1, "Elena", "Costel");

        listStuds(catalog);
        listStuds(catalog1);



    }

    private static Catalog createCatalog(String clasa, Student[] studs) {
        Catalog c = new Catalog();
        c.setClasa(clasa);
        c.setStudents(studs);

        return c;
    }

    public static Student createStudent(String nume, String prenume, int[] note) {
        Student s = new Student();
        s.setNume(nume);
        s.setPrenume(prenume);
        s.setNote(note);
        return s;
    }

    private static void listStuds(Catalog catalog) {
        System.out.println(catalog.getClasa());
        for (int i = 0; i < catalog.getStudents().length; i++) {
            System.out.print(catalog.getStudents()[i].getNume() + " ");
        }
        System.out.println();
    }

    private static void sortStuds(Catalog catalog) {
        for (int i = 0; i < catalog.getStudents().length; i++) {
            for (int j = 0; j < catalog.getStudents().length; j++) {
                if (catalog.getStudents()[i].getNume().compareTo(catalog.getStudents()[j].getNume()) < 0) {
                    Student aux = catalog.getStudents()[i];
                    catalog.getStudents()[i] = catalog.getStudents()[j];
                    catalog.getStudents()[j] = aux;
                }
            }
        }
    }
}
