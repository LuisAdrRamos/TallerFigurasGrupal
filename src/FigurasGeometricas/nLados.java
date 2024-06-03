package FigurasGeometricas;

public class nLados extends Otras_Figuras{
    int nLados;
    double area_nLados;
    double perimetro_nLados;

    public nLados() {
    }

    public nLados(int nLados, double perimetro_nLados, double area_nLados) {
        this.nLados = nLados;
        this.perimetro_nLados = perimetro_nLados;
        this.area_nLados = area_nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public double getArea_nLados() {
        return area_nLados;
    }

    public void setArea_nLados(double area_nLados) {
        this.area_nLados = area_nLados;
    }

    public double getPerimetro_nLados() {
        return perimetro_nLados;
    }

    public void setPerimetro_nLados(double perimetro_nLados) {
        this.perimetro_nLados = perimetro_nLados;
    }

    //Triangulo 3 lados
    public int triangulo() {
        return 3;
    }

    // Cuadrado 4 lados

    // Pentagono 5 lados

    // Hexagono 6 lados

    // Heptagono 7 lados

    // Octagono 8 lados

    // Nonagono 9 lados

    // Decagono 10 lados

    // Undecagono 11 lados

    // Dodecagono 12 lados

}
