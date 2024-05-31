package FigurasGeometricas;

public class FIGURASGEOMETRICAS {
    int lados;
    String nombre;

    public FIGURASGEOMETRICAS() {
    }

    public FIGURASGEOMETRICAS(int lados, String nombre) {
        this.lados = lados;
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Lados: " + getLados());
    }
}
