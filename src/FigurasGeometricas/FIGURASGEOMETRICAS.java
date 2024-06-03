package FigurasGeometricas;

public class FIGURASGEOMETRICAS {
    int lados;
    double base;
    double altura;
    String nombre;

    public FIGURASGEOMETRICAS() {
    }

    public FIGURASGEOMETRICAS(int lados, double base, double altura, String nombre) {
        this.lados = lados;
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Lados: " + getLados());
        System.out.println("Altura: " + getAltura());
        System.out.println("Base: " + getBase());
    }
}
