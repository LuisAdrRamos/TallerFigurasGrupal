package FigurasGeometricas; // Define el paquete donde se encuentra la clase.

/**
 * La clase nLados representa figuras geométricas con n lados.
 * Hereda de la clase Otras_Figuras.
 */
public class nLados extends Otras_Figuras {
    // Atributos de la clase
    double apotema; // Apotema de la figura.
    double tamlado; // Tamaño del lado de la figura.

    // Constructor por defecto que no inicializa los atributos.
    public nLados() {
    }

    // Constructor que inicializa los atributos apotema y tamlado.
    public nLados(double apotema, double tamlado) {
        this.apotema = apotema;   // Inicializa la apotema.
        this.tamlado = tamlado;   // Inicializa el tamaño del lado.
    }

    // Métodos getter y setter para el atributo apotema.
    public double getApotema() {
        return apotema;           // Devuelve la apotema.
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;   // Establece la apotema.
    }

    // Métodos getter y setter para el atributo tamlado.
    public double getTamlado() {
        return tamlado;           // Devuelve el tamaño del lado.
    }

    public void setTamlado(double tamlado) {
        this.tamlado = tamlado;   // Establece el tamaño del lado.
    }

    // Método para calcular datos de un pentágono.
    public double calculaDatosPentagono() {
        apotema = tamlado / (2.0 * Math.tan(Math.toRadians(36.0)));  // Calcula la apotema.
        perimetro = tamlado * 5;                                     // Calcula el perímetro.
        area = (perimetro * apotema) / 2;                            // Calcula el área.
        return area;                                                 // Devuelve el área.
    }

    // Método para imprimir datos de un pentágono.
    public void imprimirDatosPentagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del pentagono es: " + getArea());
        System.out.println("El perimetro del pentagono es: " + getPerimetro());
    }

    // Método para calcular datos de un hexágono.
    public double calcularDatosHexagono() {
        apotema = (tamlado * Math.sqrt(3)) / 2;  // Calcula la apotema.
        perimetro = tamlado * 6;                 // Calcula el perímetro.
        area = (perimetro * apotema) / 2;        // Corrige la fórmula del área.
        return area;                             // Devuelve el área.
    }

    // Método para imprimir datos de un hexágono.
    public void imprimirDatosHexagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del hexagono es: " + getArea());
        System.out.println("El perimetro del hexagono es: " + getPerimetro());
    }

    // Método para calcular datos de un heptágono.
    public double calcularDatosHeptagono() {
        apotema = tamlado * 1.0382060698;        // Calcula la apotema.
        perimetro = tamlado * 7;                 // Calcula el perímetro.
        area = (perimetro * apotema) / 2;        // Calcula el área.
        return area;                             // Devuelve el área.
    }

    // Método para imprimir datos de un heptágono.
    public void imprimirDatosHeptagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del heptagono es: " + getArea());
        System.out.println("El perimetro del heptagono es: " + getPerimetro());
    }

    // Método para calcular datos de un octágono.
    public double calcularDatosOctagono() {
        apotema = (tamlado * 2.41421) / 2;       // Calcula la apotema.
        perimetro = tamlado * 8;                 // Calcula el perímetro.
        area = 4 * apotema * tamlado;            // Calcula el área.
        return area;                             // Devuelve el área.
    }

    // Método para imprimir datos de un octágono.
    public void imprimirDatosOctagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del octagono es: " + getArea());
        System.out.println("El perimetro del octagono es: " + getPerimetro());
    }

    // Método para calcular datos de un nonágono.
    public double calcularDatosnonagono() {
        apotema = (tamlado / 2) * (Math.sin(Math.toRadians(70)) * Math.sin(Math.toRadians(20)));  // Calcula la apotema.
        perimetro = tamlado * 9;                                                                  // Calcula el perímetro.
        area = (9 * apotema * tamlado) / 2;                                                       // Calcula el área.
        return area;                                                                              // Devuelve el área.
    }

    // Método para imprimir datos de un nonágono.
    public void imprimirDatosNonagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del nonagono es: " + getArea());
        System.out.println("El perimetro del nonagono es: " + getPerimetro());
    }

    // Método para calcular datos de un decágono.
    public double calcularDatosdecagono() {
        apotema = tamlado / (2 * Math.tan(Math.PI / 10)); // Calcula la apotema.
        perimetro = tamlado * 10;                         // Calcula el perímetro.
        area = (perimetro * apotema) / 2;                 // Calcula el área.
        return area;                                      // Devuelve el área.
    }

    // Método para imprimir datos de un decágono.
    public void imprimirDatosDecagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del decagono es: " + getArea());
        System.out.println("El perimetro del decagono es: " + getPerimetro());
    }

    // Método para calcular datos de un endecágono.
    public double calcularDatosendecagono() {
        apotema = (tamlado / 2) * (Math.sin((9 * Math.PI) / 22) / Math.sin(Math.PI / 11)); // Calcula la apotema.
        perimetro = tamlado * 11;                                                         // Calcula el perímetro.
        area = (11 * apotema * tamlado) / 2;                                              // Calcula el área.
        return area;                                                                      // Devuelve el área.
    }

    // Método para imprimir datos de un endecágono.
    public void imprimirDatosEndecagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del endecagono es: " + getArea());
        System.out.println("El perimetro del endecagono es: " + getPerimetro());
    }

    // Método para calcular datos de un dodecágono.
    public double calcularDatosdodecagono() {
        apotema = (tamlado * ((2 + Math.sqrt(3)) / 2)); // Calcula la apotema.
        perimetro = tamlado * 12;                       // Calcula el perímetro.
        area = 6 * apotema * tamlado;                   // Calcula el área.
        return area;                                    // Devuelve el área.
    }

    // Método para imprimir datos de un dodecágono.
    public void imprimirDatosDodecagono() {
        System.out.println("Apotema: " + getApotema());
        System.out.println("Diametro del lado: " + getTamlado());
        System.out.println("El area del dodecagono es: " + getArea());
        System.out.println("El perimetro del dodecagono es: " + getPerimetro());

    }
}