package FigurasGeometricas;

import java.sql.SQLOutput;

public class Cuadrilateros extends DOS_D{
    double lado1, lado2, lado3, lado4, diagonal;
    double angulo1, angulo2;


    public Cuadrilateros() {
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

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }

    public double getBase() {
        return super.getBase();
    }

    public double getArea(){
        return super.getArea();
    }



    public double calcularDatosCuadrado() {
        area = base*base;
        perimetro = base*4;

        return area;
    }
    public void imprimirdATOSCuadrado() {
        System.out.println("EL area del cuadrado es: " + getArea());
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }

    public double calcularDatosRectangulo(){
        area = 0;
        perimetro = 0;
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        return area;
    }
    public void imprimirDatosRectangulo() {
        System.out.println("EL area del rectangulo es: " + getArea());
        System.out.println("El perimetro del rectangulo es: " + getPerimetro());
    }

    public double calcularAreaTrianguloI(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double areat = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return areat;
    }
    public double calcularDatosCuadrilateroIrregular () {
        perimetro = lado1+ lado2+ lado3+ lado4;
        double area1 = calcularAreaTrianguloI(lado1, lado2, diagonal);
        double area2 = calcularAreaTrianguloI(lado3, lado4, diagonal);
        area = area1 + area2;
        return area;
    }

    public void ImprimirDatosCuadrilateroIrregular() {
        System.out.println("El area del cuadrilatero irregular es: " + area);
        System.out.println("El perimetro del cuadrilatero irregular es: " + perimetro);
    }
}
