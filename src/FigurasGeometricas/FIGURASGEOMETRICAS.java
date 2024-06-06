package FigurasGeometricas;  // Define el paquete donde se encuentra la clase.

/**
 * La clase FIGURASGEOMETRICAS representa una figura geométrica genérica.
 * Esta clase actúa como una clase base para otras figuras geométricas.
 */
public class FIGURASGEOMETRICAS {
    // Atributos de la clase
    int lados;              // Número de lados de la figura.
    double base;            // Base de la figura.
    double altura;          // Altura de la figura.
    String nombre;          // Nombre de la figura.

    // Constructor por defecto que no inicializa los atributos.
    public FIGURASGEOMETRICAS() {
    }

    // Constructor que inicializa todos los atributos de la figura geométrica.
    public FIGURASGEOMETRICAS(int lados, double base, double altura, String nombre) {
        this.lados = lados;         // Inicializa el número de lados.
        this.base = base;           // Inicializa la base.
        this.altura = altura;       // Inicializa la altura.
        this.nombre = nombre;       // Inicializa el nombre.
    }

    // Métodos getter y setter para el atributo lados.
    public int getLados() {
        return lados;               // Devuelve el número de lados.
    }

    public void setLados(int lados) {
        this.lados = lados;         // Establece el número de lados.
    }

    // Métodos getter y setter para el atributo base.
    public double getBase() {
        return base;                // Devuelve la base.
    }

    public void setBase(double base) {
        this.base = base;           // Establece la base.
    }

    // Métodos getter y setter para el atributo altura.
    public double getAltura() {
        return altura;              // Devuelve la altura.
    }

    public void setAltura(double altura) {
        this.altura = altura;       // Establece la altura.
    }

    // Métodos getter y setter para el atributo nombre.
    public String getNombre() {
        return nombre;              // Devuelve el nombre.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;       // Establece el nombre.
    }

    // Método que imprime los datos de la figura geométrica.
    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());  // Imprime el nombre.
        System.out.println("Lados: " + getLados());    // Imprime el número de lados.
        System.out.println("Altura: " + getAltura());  // Imprime la altura.
        System.out.println("Base: " + getBase());      // Imprime la base.
    }
}
