package pack1;

public class Main13 {

        public static void main(String[] args) {
            int v[ ] = {2, 3, -1, -2, 6,4,8,9,8};
            int i = 0; //parcurgem vecorul
            int n = v.length; //dimensiunea vectorului
            while (i <= n-1){
                if(v[i] % 2 == 0 ) {
                    System.out.println(v[i]);
                }
                i++;
            }
        }
    }
