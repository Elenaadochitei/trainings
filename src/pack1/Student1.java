package pack1;

import java.sql.Statement;

public class Student1 {
    private String name=lalala();
    private static int nrStudent1=lala();

    public Student1(){
        System.out.println("Constructor");
    }
    public static int lala (){
        System.out.println("Am intrat aici");
        return 2;
    }

    public String lalala(){
        System.out.println("Am intrat si aici");
        return " ";
    }
    static {
        System.out.println("Chiar si aici");
    }
}
