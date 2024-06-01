package FigurasGeometricas;

public class Circulos extends otros_regulares{
    double radio;
    double diametro;

    public Circulos() {
    }

    public Circulos(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double area_circulo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
