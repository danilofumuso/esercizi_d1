public class Esercizio3 {

    public int perimetroRettangolo(int x, int y) {
        return 2 * x + 2 * y;
    }

    public int pariDispari(int x) {
        if (x % 2 == 0) return 0;
        else return 1;
    }

    public double areaTriangolo(double x, double y, double z){
      double p= (x + y + z) / 2; //semiperimetro di un triangolo
        //formula di Erone
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
        //andrebbe fatto un controllo per la disuguaglianza triangolare!
    }

}

