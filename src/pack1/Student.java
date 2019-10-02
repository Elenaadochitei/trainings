package pack1;

public class Student {

    private int absenta;
    private int note[];
    private String nume;
    private String prenume;
    private static Biblioteca biblioteca;
    static String carte;

    public int getAbsenta() {
        return absenta;
    }

    public void setAbsenta(int absenta) {
        this.absenta = absenta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {

        if (nume.matches("^[a-zA-Z]*$")) {

            this.nume = nume;
        } else {
            System.out.println("ESTI LA FURAT");
        }
    }

    public void setNote(int v[]) {
        this.note = v;
    }

    public int[] getNote() {
        return note;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {

        this.prenume = prenume;
    }

    public static String getCarte() {
        return carte;
    }

    public Student() {

    }

    public Student(String c) {
        this.nume = c;
    }

    public Student(String nume, int[] note) {
        this.nume = nume;
        this.note = note;
    }


}

