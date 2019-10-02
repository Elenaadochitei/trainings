package pack1;

public class Student2 {
    private String xyz;
    private String xxx;

   void metoda(){
       System.out.println("ION");
    }

    void metoda1(){
       xyz= "Andrei";
    }

    void metoda2(){
       xyz="Ion";
    }

    void metoda3(String xyz){
       this.xyz= xyz;
    }

    void metoda4(String xxx){
       this.xxx=xxx;
    }
    void afisare(){
        System.out.print(xyz + " ");
    }

    void afisare1(){
        System.out.print(xxx+ " " );
    }

    String expunerexxx (){
      return this.xxx;
    }

    String expunerexyz(){
       return this.xyz;
    }

}
