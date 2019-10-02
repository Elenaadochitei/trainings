package pack1;

class Biblioteca {

    private Carte[] carte;//= {"Romana", "Mate", "Info", "Istorie"};

    Carte[] getCarte() {
        return this.carte;
    }

    void setCarte(Carte[] c) {
        this.carte = c;
    }

    public void sortare() {
        System.out.println("Afisarea dupa titlu in ordine descrescatoare este: ");

        for (int i = 0; i < getCarte().length; i++) {
            for (int j = 0; j < getCarte().length; j++) {
                if ((getCarte()[i].getTitlu().compareTo(getCarte()[j].getTitlu())) < 0) {
                    Carte aux = getCarte()[i];
                    getCarte()[i] = getCarte()[j];
                    getCarte()[j] = aux;
                }
            }
        }
        for (int i = 0; i < getCarte().length; i++) {
            System.out.print(getCarte()[i].getTitlu() + " ");

        }
    }


    public Carte imprumutaCarte(String carteDeLuat) {
        Carte val = null;
        for (int i = 0; i < getCarte().length; i++) {
            if ((carte[i] != null) && (getCarte()[i].getTitlu().equals(carteDeLuat))) {
                val = getCarte()[i];
                carte[i] = null;
                break;
            }
        }

        return val;

    }

    public Carte retur(Carte carteDeAdus) {
        Carte val2 = null;
        for (int i = 0; i < getCarte().length; i++) {
            if (carte[i] == null) {
                carte[i] = carteDeAdus;
                break;
            }
        }
        return val2;
    }

    public void afisare() {

        System.out.println("Cartile disponibile sunt:");
        for (int i = 0; i < getCarte().length; i++) {
            if (carte[i] != null) {
                System.out.println(this.carte[i].getTitlu());

            }
        }
        int i = 0;
        int count = 0;
        System.out.println("Numarul cartilor imprumutate este:");
        for (i = 0; i < getCarte().length; i++) {

            if (carte[i] == null) {
                count++;
            }
        }
        System.out.println(count);

    }
}

