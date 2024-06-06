package FigurasGeometricas;

// La clase DOS_D extiende de FIGURASGEOMETRICAS, utilizando herencia para adquirir propiedades y comportamientos comunes.
public class DOS_D extends FIGURASGEOMETRICAS {

    // Definición de los atributos específicos de la clase DOS_D.
    double area;
    double perimetro;

    // Constructor por defecto que no inicializa los atributos.
    public DOS_D() {
    }

    // Constructor que inicializa los atributos area y perimetro.
    public DOS_D(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    // Métodos getter y setter para el atributo area.
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Métodos getter y setter para el atributo perimetro.
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
