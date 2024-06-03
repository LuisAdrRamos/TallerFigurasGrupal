package FigurasGeometricas;

public class Triangulos extends DOS_D {
    double lado1, lado2, lado3;

    public Triangulos() {
    }
    public Triangulos(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getBase() {
        return super.getBase();
    }

    public double getAltura () {return super.getAltura();}

    public double getArea(){
        return super.getArea();
    }

    //TRIANGULO ISOCELES
    public double calcularDatosTriangulosIsoceles() {
        area = (base * altura) /2;
        perimetro = (altura * 2) + base;
        return area;
    }

    public void imprimirDatosTrianguloIsoceles() {
        System.out.println("EL area del triangulo es: " + getArea());
        System.out.println("El perimetro del triangulo es: " + getPerimetro());
    }

    //TRIANGULO EQUILATERO
    public double calcularDatosTrianguloEquilatero () {
        area = (base * base) /2;
        perimetro = (base * 3);
        return area;
    }

    public void imprimirDatosTrianguloEquilatero() {
        System.out.println("EL area del triangulo es: " + getArea());
        System.out.println("El perimetro del triangulo es: " + getPerimetro());
    }

    //TRIANGULO IRREGULAR (ESCALENO)
    public double calcularDatosTrianguloEscaleno () {
        perimetro = lado1+lado2+lado3;
        double Sperim = perimetro/2;
        area = Math.sqrt(Sperim*(Sperim-lado1)*(Sperim-lado2)*(Sperim-lado3));
        return area;
    }
    public void imprimirDatosTrianguloEscaleno() {
        System.out.println("EL area del triangulo es: " + getArea());
        System.out.println("El perimetro del triangulo es: " + getPerimetro());
    }
}