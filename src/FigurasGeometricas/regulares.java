package FigurasGeometricas;

public class regulares extends DOS_D{

    double area;
    double perimetro;
    int lados;

    public regulares() {
    }

    public regulares(double area, double perimetro, int lados) {
        this.area = area;
        this.perimetro = perimetro;
        this.lados = lados;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public int getLados() {
        return lados;
    }

    @Override
    public void setLados(int lados) {
        this.lados = lados;
    }




