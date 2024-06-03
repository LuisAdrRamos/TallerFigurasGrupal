package FigurasGeometricas;

import java.sql.SQLOutput;

public class Cuadrilateros extends DOS_D{

    double lado1, lado2, lado3, lado4;
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

    public void calcularDatisRectaguloIrregular () {
        angulo1 = Math.toRadians(angulo1);
        angulo2 = Math.toRadians(angulo2);

        area = (0.5 * lado1 * lado2  * (Math.sin(angulo1)))+ (0.5 * lado3 * lado4 * (Math.sin(angulo2)));
        perimetro = lado1 +  lado2 + lado3 + lado4;

    }

    public void ImprimirDatosRectanguloIrregular() {
        System.out.println("El area del rectangulo irregular es: " + area);
        System.out.println("El perimetro del rectangulo irregular es: " + perimetro);
    }
}
