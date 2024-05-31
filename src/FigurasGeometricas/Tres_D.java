package FigurasGeometricas;


public class Tres_D extends  FIGURASGEOMETRICAS{
    int num_Caras;
    double aristas;

    public Tres_D() {
    }

    public Tres_D(int num_Caras, double aristas) {
        this.num_Caras = num_Caras;
        this.aristas = aristas;
    }

    public int getNum_Caras() {
        return num_Caras;
    }

    public void setNum_Caras(int num_Caras) {
        this.num_Caras = num_Caras;
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }
}
