package FigurasGeometricas;

// La clase Cuadrilateros hereda de DOS_D, utilizando herencia simple.
public class Cuadrilateros extends DOS_D {
    // Definición de los atributos específicos de la clase Cuadrilateros.
    double lado1, lado2, lado3, lado4, diagonal;
    double angulo1, angulo2;

    // Constructor por defecto que no inicializa los atributos.
    public Cuadrilateros() {
    }

    // Métodos getter y setter para los atributos lado1, lado2, lado3, lado4, diagonal, angulo1 y angulo2.
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

    // Método getter para obtener el valor de la base desde la superclase DOS_D.
    public double getBase() {
        return super.getBase();
    }

    // Método getter para obtener el valor del área desde la superclase DOS_D.
    public double getArea() {
        return super.getArea();
    }

    // Método para calcular los datos de un cuadrado.
    public double calcularDatosCuadrado() {
        // Calcula el área del cuadrado utilizando la fórmula base^2.
        area = base * base;
        // Calcula el perímetro del cuadrado utilizando la fórmula 4*base.
        perimetro = base * 4;

        // Retorna el área calculada.
        return area;
    }

    // Método para imprimir los datos del cuadrado.
    public void imprimirdATOSCuadrado() {
        // Imprime el área del cuadrado.
        System.out.println("EL area del cuadrado es: " + getArea());
        // Imprime el perímetro del cuadrado.
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }

    // Método para calcular los datos de un rectángulo.
    public double calcularDatosRectangulo() {
        // Inicializa el área y el perímetro a 0.
        area = 0;
        perimetro = 0;
        // Calcula el área del rectángulo utilizando la fórmula base*altura.
        area = base * altura;
        // Calcula el perímetro del rectángulo utilizando la fórmula 2*(base + altura).
        perimetro = (base * 2) + (altura * 2);
        // Retorna el área calculada.
        return area;
    }

    // Método para imprimir los datos del rectángulo.
    public void imprimirDatosRectangulo() {
        // Imprime el área del rectángulo.
        System.out.println("EL area del rectangulo es: " + getArea());
        // Imprime el perímetro del rectángulo.
        System.out.println("El perimetro del rectangulo es: " + getPerimetro());
    }

    // Método para calcular el área de un triángulo irregular utilizando la fórmula de Herón.
    public double calcularAreaTrianguloI(double a, double b, double c) {
        // Calcula el semiperímetro.
        double s = (a + b + c) / 2;
        // Calcula el área utilizando la fórmula de Herón.
        double areat = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // Retorna el área calculada.
        return areat;
    }

    // Método para calcular los datos de un cuadrilátero irregular.
    public double calcularDatosCuadrilateroIrregular() {
        // Calcula el perímetro sumando los lados.
        perimetro = lado1 + lado2 + lado3 + lado4;
        // Calcula el área dividiendo el cuadrilátero en dos triángulos.
        double area1 = calcularAreaTrianguloI(lado1, lado2, diagonal);
        double area2 = calcularAreaTrianguloI(lado3, lado4, diagonal);
        area = area1 + area2;
        // Retorna el área calculada.
        return area;
    }

    // Método para imprimir los datos del cuadrilátero irregular.
    public void ImprimirDatosCuadrilateroIrregular() {
        // Imprime el área del cuadrilátero irregular.
        System.out.println("El area del cuadrilatero irregular es: " + area);
        // Imprime el perímetro del cuadrilátero irregular.
        System.out.println("El perimetro del cuadrilatero irregular es: " + perimetro);
    }
}
