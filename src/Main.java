import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Esercizio 1
        Esercizio1 esercizio1 = new Esercizio1();

        int risultato = esercizio1.moltiplica(5, 4);
        System.out.println("il risultato è: " + risultato);

        String saldo = esercizio1.concatena("In banca ho: ", 5000000);
        System.out.println(saldo + "€");

        String[] arrayIniziale = {"cane", "gatto", "elefante", "foca", "canguro"};
        String[] arrayFinale = esercizio1.inserisciInArray(arrayIniziale, "coniglio");

        for (int i = 0; i < arrayFinale.length; i++) {
            System.out.println(arrayFinale[i]);
        }



        //Esercizio 2
        System.out.println("Scrivi una frase!");
        String frase1 = scanner.nextLine();
        System.out.println("Scrivi una frase!");
        String frase2 = scanner.nextLine();
        System.out.println("Scrivi una frase!");
        String frase3 = scanner.nextLine();
        System.out.println(frase1 + " " + frase2 + " " + frase3);
        System.out.println(frase3 + " " + frase2 + " " + frase1);

        //Esercizio 3

        Esercizio3 esercizio3 = new Esercizio3();

        int perimetroRettangolo = esercizio3.perimetroRettangolo(5, 6);
        System.out.println(perimetroRettangolo);

        int pariDispari = esercizio3.pariDispari(3);
        System.out.println("0 se è pari, 1 se dispari: " + pariDispari);

        double areaTriangolo = esercizio3.areaTriangolo(10.4, 3.0, 9.5);
        System.out.println(areaTriangolo);

    }


}