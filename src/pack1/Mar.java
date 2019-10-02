package pack1;

public class Mar {
    private String gust;
    private String culoare;
    private int nrSeminte;

    public void marDulce() {
        gust = " dulce";
    }
    public void marVerde() {
        culoare = "verde";
    }
    public void marRosu() {
        gust = "acru";
    }
    public int nrSeminte(){
        return nrSeminte;
    }
    public void setNrSeminte(int s){
        nrSeminte= s;
    }
    void esteCopt() {
        if (gust.equals("dulce") && culoare.equals("rosu")) {
            System.out.println("este dulce");
        } else {
            System.out.println("nu este dulce");
        }
    }
}