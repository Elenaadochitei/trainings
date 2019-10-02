package pack1;

public class CombinatiiValoriVector {

    public static void main(String[] args) {
        int v[] = {0, 1, 2, 3, 4, 5};


        int n = v.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j <= n-1) {
                    System.out.print(v[i] + "" + v[j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
