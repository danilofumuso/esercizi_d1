public class Esercizio1 {

    public int moltiplica(int x, int y) {
        return x * y;
    }

    // Se aggiungo static al metodo posso usarlo senza creare un'istanza della classe ma richiamando la classe stessa!
    // Esercizio1.moltiplica(x,y)

    public String concatena(String frase, int num) {
        return frase + num;
    }

    public String[] inserisciInArray(String[] array, String string) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = string;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }


}
