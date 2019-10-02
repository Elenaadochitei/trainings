package pack1;

public class laInceput {
    public static void main(String[] args) {

        System.out.println("salut");

        String nume=new String("TestNume");

        int valoare=hello(nume, 2, 3);

        System.out.println(valoare);

      String temp =numeUser("Ramon");
        System.out.println(temp.length()+ "- Numarul total de caractere din sir" + "\n" +"Sirul este " + temp);
    }

    public static int  hello(String nume, int a, int b){

        int sum = a+b;

        System.out.println("Salutare "+ "\n" + nume + "!");

        return sum;
    }

    public static String numeUser(String nume){
        String ret="numele tau este " + nume;
        return ret;
    }
}
