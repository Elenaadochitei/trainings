package pack1;

public class Main12 {
    public static void main(String[] args) {
        int v[ ] = {2, 3, -1, -2, 5};
        int i = 0;
        int min = v[0];
        int n = 5;
        while (i <= n - 1) {
            System.out.println(v[i]);
            if (v[i] < min) {
                min = v[i];
            }
            i++;
        }
        System.out.println("minimul este" + min);

        i=0;
        int max = v[0];
        while (i <= n - 1){
            System.out.println(v[i]);
            if(v[i] > max ){
                max = v[i];
            }
            i++;
        }
        System.out.println("maximul este" + max);
    }
}
