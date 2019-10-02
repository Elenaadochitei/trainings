package pack1;

public class Main11 {
    public static void main(String[] args) {
        int v[] = {2, 3, -1, -2, 5};
        int i = 0; //  " i " este o variabila folosita pentru a itera/parcurge vectorul
        int min = v[0]; // el ia prima valoare din vector, reprezentata cu " v[0] "
        int n = 5; // n este dimensiunea vectorului -- adica cate elemente are vectorul

        while (i <= n - 1) {  // cat timp i ( cel cu care iteram ) nu a ajuns la sfarsit de vector  (adica la ultima pozitie din vector )

            System.out.println(v[i]); // afisam VALOAREA ( V[i] )  de la pozitia curenta -- adica pozitia = valoarea variabilei " i :
            if (v[i] < min) { // comparam v[i], adica elementul la carene aflam cu minimul gasit pana acum in parcurgerea vectoruli
                min = v[i];  // aici ajunge doar daca conditia e adevarata --> inseamna ca am gasit un nou element
                            // mai mic decat minimul de pana acum si il salvam in variabila min

            }
            i++; // crestem i-ul, adica numarul pozitiei --> trecem la urmatorul element
        }
        System.out.println(min); // afisam minimul din vector doar la sfarsit, dupa ce am terminat de iterat prin vector
    }
}
