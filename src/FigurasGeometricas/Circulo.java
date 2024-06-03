package FigurasGeometricas;

public class Circulo extends Otras_Figuras{
    double radio;
    double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
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

    // Calcular area de un circulo
    public double area_circulo() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Calcular perimetro de un circulo
    public double perimetro_circulo() {
        return Math.PI * diametro;
    }

    public void imprimirDatosCirculo() {
        System.out.println("El area del circulo es: " + area_circulo());
        System.out.println("El perimetro del circulo es: " + perimetro_circulo());
    }
}
