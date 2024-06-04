package FigurasGeometricas;

public class Circunferencias extends Otras_Figuras{
    double radio;
    double radioSecundario;

    public Circunferencias() {
    }

    public Circunferencias(double radio) {
        this.radio = radio;
        this.radioSecundario = radioSecundario;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadioSecundario() {
        return radioSecundario;
    }

    public void setRadioSecundario(double radioSecundario) {
        this.radioSecundario = radioSecundario;
    }

    public double calcularAreaCirculo() {
        area= Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;
        return area;
    }

    public void imprimirDatosCirculo(){
        System.out.println("El area del Circulo es: " + getArea());
        System.out.println("El perimetro del circulo es: " + getPerimetro());
    }

    public double calcularAreaElipse(){
        area = Math.PI * radio * radioSecundario;
        perimetro = 2 * Math.PI * (Math.sqrt((Math.pow(radio, 2)+Math.pow(radioSecundario, 2))/2));
        return area;
    }
    public void imprimirDatosElipse(){
        System.out.println("El area de la elipse: " + getArea());
        System.out.println("El perimetro de la elipse: " + getPerimetro());
    }
}