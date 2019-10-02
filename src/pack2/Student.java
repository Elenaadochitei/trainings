package pack2;

public class Student {
    private String name =n();
    private static int nrStud = lala();

    public Student() {
        System.out.println("Am intrat in constructor");
    }

    private static int lala() {
        System.out.println(" am intrat");
        return 2;
    }

    private  String n (){
        System.out.println(" numele ");
        return  " ";
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}
