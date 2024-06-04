import FigurasGeometricas.FIGURASGEOMETRICAS;
import FigurasGeometricas.Cuadrilateros;
import FigurasGeometricas.Circunferencias;
import FigurasGeometricas.Triangulos;
import FigurasGeometricas.nLados;
import FigurasGeometricas.Tres_D;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\tCALCULADORA DE FIGURAS\n");
            System.out.println("¡Hola, bienvenido a tu calculadora favorita!\n\nSelecciona una categoria\n");
            System.out.println("\t1. Figuras 2D\n\t2. Figuras 3D\n\t3. Salir\n");
            System.out.print("Ingresa una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nFiguras 2D\n");
                    figuras2D();
                    break;
                case 2:
                    System.out.println("\nFiguras 3D\n");
                    figuras3D();
                    break;
                case 3:
                    System.out.println("¡Gracias por preferirnos!");
                    break;
                default:
                    System.out.println("Ingrese un número válido (1, 2 o 3).");
            }
        } while (op != 3);
    }

    public static void figuras2D() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Circunferencias\n\t2. Triangulos\n\t3. Cuadrilateros\n\t4. Nlados\n\t5. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Circunferencias");
                    Circunferencias();
                    break;
                case 2:
                    System.out.println("Triangulos");
                    triangulos();
                    break;
                case 3:
                    System.out.println("Cuadrilateros");
                    cuadrilateros();
                    break;
                case 4:
                    System.out.println("Figuras de N lados");
                    Nlados();
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...\n");
                    return;
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4 o 5).");
            }
        } while (op != 5);
    }

    public static void figuras3D() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Esferas\n\t2. Cilindros\n\t3. Cubos\n\t4. Piramides\n\t5. Prismas\n\t6. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Esferas");
                    esferas();
                    break;

                case 2:
                    System.out.println("Cilindro");
                    cilindros();
                    break;

                case 3:
                    System.out.println("Cubos");
                    cubos();
                    break;

                case 4:
                    System.out.println("Piramides");
                    Piramides();
                    break;

                case 5:
                    System.out.println("Prismas");
                    Prisma();
                    break;

                case 6:
                    System.out.println("Regresando al menú principal...\n");
                    return;
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4, 5 o 6).");
            }
        } while (op != 5);
    }

    //FIGURAS EN 2D

    public static void Circunferencias () {
        Scanner sc = new Scanner(System.in);
        Circunferencias c1 = new Circunferencias();
        int op;
        double radio, radiosecundario;

        do {
            System.out.println("Seleccione la figura a calcular\n");
            System.out.println("\t1. Circulo \n\t2. Elipse\n\t3. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n\tCirculo");
                    System.out.printf ("Ingrese el radio del circulo: ");
                    c1.setRadio(sc.nextDouble());

                    c1.calcularAreaCirculo();
                    c1.imprimirDatosCirculo();
                    break;

                case 2:
                    System.out.println("\n\tElipse");
                    System.out.println ("Ingrese el radio del elipse: ");
                    c1.setRadio(sc.nextDouble());
                    System.out.println ("Ingrese el radio Secundario del elipse: ");
                    c1.setRadioSecundario(sc.nextDouble());

                    c1.calcularAreaElipse();
                    c1.imprimirDatosElipse();
                    break;
                case 3:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1, 2 o 3).");

            }
        } while (op != 3);
    }

    public static void triangulos(){
        Scanner sc = new Scanner(System.in);
        Triangulos t1 = new Triangulos();
        int op;
        do {
            System.out.println("\nSeleccione el tipo de triangulo a calcular\n");
            System.out.println("\t1. Equilatero\n\t2. Isoceles\n\t3. Escaleno\n\t4. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n\tTriangulo Equilatero");
                    System.out.println("Ingrese la medida de la base del triangulo");
                    t1.setBase(sc.nextDouble());

                    t1.calcularDatosTrianguloEquilatero();
                    t1.imprimirDatosTrianguloEquilatero();

                    break;
                case 2:
                    System.out.println("\n\tTriangulo Isoceles");
                    System.out.println("Ingrese la medida de la base del triangulo");
                    t1.setBase(sc.nextDouble());
                    System.out.println("Ingrese la medida de la altura del triangulo");
                    t1.setAltura(sc.nextDouble());

                    t1.calcularDatosTriangulosIsoceles();
                    t1.imprimirDatosTrianguloIsoceles();
                    break;
                case 3:
                    System.out.println("\n\tTriangulo Escaleno");
                    System.out.println("Ingrese la medida del lado 1 del triangulo");
                    t1.setLado1(sc.nextDouble());
                    System.out.println("Ingrese la medida del lado 2 del triangulo");
                    t1.setLado2(sc.nextDouble());
                    System.out.println("Ingrese la medida del lado 3 del triangulo");
                    t1.setLado3(sc.nextDouble());

                    t1.calcularDatosTrianguloEscaleno();
                    t1.imprimirDatosTrianguloEscaleno();
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...\n");
                    return;
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3 o 4).");
            }
        } while (op != 5);
    }

    public static void cuadrilateros() {
        Scanner sc = new Scanner(System.in);
        Cuadrilateros c1 = new Cuadrilateros();
        int op;
        double lado, base, altura;
        do {
            System.out.println("Seleccione la figura a calcular\n");
            System.out.println("\t1. Cuadrado\n\t2. Rectangulo\n\t3. Cuadrilatero Irregular\n\t4. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("\n\tCuadrado");
                    System.out.println("Ingrese la logitud de un lado del cuadrado");
                    c1.setBase(sc.nextDouble());

                    c1.calcularDatosCuadrado();
                    c1.imprimirdATOSCuadrado();
                    break;

                case 2:
                    System.out.println("\n\tRectangulo");
                    System.out.println("Ingrese la base del rectangulo");
                    c1.setBase(sc.nextDouble());
                    System.out.println("Ingrese la altura del rectangulo");
                    c1.setAltura(sc.nextDouble());

                    c1.calcularDatosRectangulo();
                    c1.imprimirDatosRectangulo();
                    break;

                case 3:
                    System.out.println("\n\tCuadrilatero Irregular");
                    System.out.println("Ingrese la longitud del lado 1: ");
                    c1.setLado1(sc.nextDouble());
                    System.out.println("Ingrese la longitud del lado 2: ");
                    c1.setLado2(sc.nextDouble());
                    System.out.println("Ingrese la longitud del lado 3: ");
                    c1.setLado3(sc.nextDouble());
                    System.out.println("Ingrese la longitud del lado 4: ");
                    c1.setLado4(sc.nextDouble());
                    System.out.println("Ingrese la longitud de la diagonal: ");
                    c1.setDiagonal(sc.nextDouble());

                    c1.calcularDatosCuadrilateroIrregular();
                    c1.ImprimirDatosCuadrilateroIrregular();
                    break;
                case 4:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1, 2 o 3).");
            }
        } while (op!=3);
    }

    public static void Nlados(){
        Scanner sc = new Scanner(System.in);
        nLados nlados1 = new nLados();
        int numlados;

        System.out.println("\nIngrese el numero de lados de su figura\n");
        numlados = sc.nextInt();
        while (numlados < 5 || numlados > 12){
            System.out.println("El numero de lados debe estar entre 5 y 12\nIngrese el dato de nuevo");
            numlados = sc.nextInt();
        }
        if (numlados == 5) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calculaDatosPentagono();
            nlados1.imprimirDatosPentagono();

        } else if (numlados == 6) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosHexagono();
            nlados1.imprimirDatosHexagono();

        } else if (numlados == 7) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosHeptagono();
            nlados1.imprimirDatosHeptagono();

        } else if (numlados == 8) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosOctagono();
            nlados1.imprimirDatosOctagono();

        } else if (numlados == 9) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosnonagono();
            nlados1.imprimirDatosNonagono();

        } else if (numlados == 10) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosdecagono();
            nlados1.imprimirDatosDecagono();

        } else if (numlados == 11) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosendecagono();
            nlados1.imprimirDatosEndecagono();

        } else if (numlados == 12) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble());
            nlados1.calcularDatosdodecagono();
            nlados1.imprimirDatosDodecagono();
        }
    }

    //FIGURAS EN 3D

    public static void esferas(){
        Scanner sc = new Scanner(System.in);
        Tres_D esfera = new Tres_D();
        System.out.println("Ingrese el radio de la esfera");
        esfera.setRadio(sc.nextDouble());

        esfera.calcularDatosEsfera();
        esfera.imprimirDatosEsfera();
    }

    public static void cilindros() {
        Scanner sc = new Scanner(System.in);
        Tres_D cilindro = new Tres_D();
        System.out.println("Ingrese el radio de la cilindro");
        cilindro.setRadio(sc.nextDouble());
        System.out.println("Ingrese la altura del cilindro");
        cilindro.setAltura(sc.nextDouble());

        cilindro.calcularDatosCilindro();
        cilindro.imprimirDatosCilindro();
    }

    public static void cubos(){
        Scanner sc = new Scanner(System.in);
        Tres_D cubo = new Tres_D();
        System.out.println("Ingrese el area de la cara de la cubo");
        cubo.setArea(sc.nextDouble());

        cubo.calcularDatosCubo();
        cubo.imprimirDatosCubo();
    }

    public static void Piramides () {
        Tres_D  p1 = new Tres_D();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el area de la piramide: ");
        p1.setArea(sc.nextDouble());
        System.out.println("Ingrese el altura de la piramide: ");
        p1.setAltura(sc.nextDouble());

        p1.calcularDatosPiramide();
        p1.imprimirDatosPiramide();

    }

    public static void Prisma () {
        Tres_D  prisma = new Tres_D();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el area del prisma: ");
        prisma.setArea(sc.nextDouble());
        System.out.println("Ingrese el altura del prisma: ");
        prisma.setAltura(sc.nextDouble());

        prisma.calcularDatosPrisma();
        prisma.imprimirDatosPrisma();
    }

}