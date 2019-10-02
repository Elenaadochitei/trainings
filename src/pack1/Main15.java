package pack1;

public class Main15 {

    public static void main(String[] args) {
         int v [ ] = { 0,1,2,0,0,3,4 };

         // 01 , 02, 00 , 00 ,03, 04
        // 12  10 10 13 14


         int i =0;
         int sw=0;
         int n=7;
         for (i=0; i<=n-1; i++){
             if (v[i]==0){
                 int j;
                 for (j=n-1; j > i; j--){
                     if (v[j] !=0){
                         break;
                     }
                 }
                 sw=v[i];
                 v[i]=v[j];
                 v[j]=sw;
             }
        }
        for(i=0;i<n;i++){
            System.out.println(v[i] + " ");
        }


    }
}


