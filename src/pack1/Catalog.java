package pack1;

public class Catalog {

    private String clasa;
    private Student[] students;

    public void setStudents(Student s1[]) {
        this.students = s1;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    void transfer(Catalog c2, String deTransferat, String deLuat) {
        for (int i = 0; i < this.getStudents().length; i++) {
            if (this.getStudents()[i].getNume().equals(deTransferat)) {
                for (int j = 0; j < c2.getStudents().length; j++) {
                    if (c2.getStudents()[j].getNume().equals(deLuat)) {
                        Student aux = this.getStudents()[i];
                        this.getStudents()[i] = c2.getStudents()[j];
                        c2.getStudents()[j] = aux;
                        break;
                    }
                    break;
                }
            }
        }

    }
}
