// Importaciones de paquetes y clases necesarias
import FigurasGeometricas.FIGURASGEOMETRICAS;
import FigurasGeometricas.Cuadrilateros;
import FigurasGeometricas.Circunferencias;
import FigurasGeometricas.Triangulos;
import FigurasGeometricas.nLados;
import FigurasGeometricas.Tres_D;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        int op; // Variable para la opción seleccionada por el usuario

        // Bucle do-while para mostrar el menú principal hasta que el usuario decida salir
        do {
            System.out.println("\n\tCALCULADORA DE FIGURAS\n");
            System.out.println("Integrantes:");
            System.out.println("Richard Padilla, Joel Parra, Carlos Perez, Isaac Quinapallo, Adrian Ramos, Alisson Viracocha\n");
            System.out.println("¡Hola, bienvenido a tu calculadora favorita!\n\nSelecciona una categoria\n");

            System.out.println("\t1. Figuras 2D\n\t2. Figuras 3D\n\t3. Salir\n");
            System.out.print("Ingresa una opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op) {
                case 1:
                    System.out.println("\nFiguras 2D\n");
                    figuras2D(); // Llamar al método figuras2D
                    break;
                case 2:
                    System.out.println("\nFiguras 3D\n");
                    figuras3D(); // Llamar al método figuras3D
                    break;
                case 3:
                    System.out.println("¡Gracias por preferirnos!"); // Mensaje de despedida
                    break;
                default:
                    System.out.println("Ingrese un número válido (1, 2 o 3)."); // Mensaje de error para opción inválida
            }
        } while (op != 3); // Repetir hasta que el usuario decida salir
    }

    // Método para gestionar las figuras 2D
    public static void figuras2D() {
        Scanner sc = new Scanner(System.in);
        int op;

        // Bucle do-while para mostrar el menú de figuras 2D hasta que el usuario decida regresar
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Circunferencias\n\t2. Triangulos\n\t3. Cuadrilateros\n\t4. Nlados\n\t5. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op) {
                case 1:
                    System.out.println("Circunferencias");
                    Circunferencias(); // Llamar al método Circunferencias
                    break;
                case 2:
                    System.out.println("Triangulos");
                    triangulos(); // Llamar al método triangulos
                    break;
                case 3:
                    System.out.println("Cuadrilateros");
                    cuadrilateros(); // Llamar al método cuadrilateros
                    break;
                case 4:
                    System.out.println("Figuras de N lados");
                    Nlados(); // Llamar al método Nlados
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...\n");
                    return; // Regresar al menú principal
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4 o 5)."); // Mensaje de error para opción inválida
            }
        } while (op != 5); // Repetir hasta que el usuario decida regresar al menú principal
    }

    // Método para gestionar las figuras 3D
    public static void figuras3D() {
        Scanner sc = new Scanner(System.in);
        int op;

        // Bucle do-while para mostrar el menú de figuras 3D hasta que el usuario decida regresar
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Esferas\n\t2. Cilindros\n\t3. Cubos\n\t4. Piramides\n\t5. Prismas\n\t6. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op) {
                case 1:
                    System.out.println("Esferas");
                    esferas(); // Llamar al método esferas
                    break;
                case 2:
                    System.out.println("Cilindro");
                    cilindros(); // Llamar al método cilindros
                    break;
                case 3:
                    System.out.println("Cubos");
                    cubos(); // Llamar al método cubos
                    break;
                case 4:
                    System.out.println("Piramides");
                    Piramides(); // Llamar al método Piramides
                    break;
                case 5:
                    System.out.println("Prismas");
                    Prisma(); // Llamar al método Prisma
                    break;
                case 6:
                    System.out.println("Regresando al menú principal...\n");
                    return; // Regresar al menú principal
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4, 5 o 6)."); // Mensaje de error para opción inválida
            }
        } while (op != 6); // Repetir hasta que el usuario decida regresar al menú principal
    }

    // Método para gestionar las circunferencias
    public static void Circunferencias () {
        Scanner sc = new Scanner(System.in);
        Circunferencias c1 = new Circunferencias(); // Crear un objeto Circunferencias
        int op;
        double radio, radiosecundario;

        // Bucle do-while para mostrar el menú de circunferencias hasta que el usuario decida regresar
        do {
            System.out.println("Seleccione la figura a calcular\n");
            System.out.println("\t1. Circulo \n\t2. Elipse\n\t3. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op) {
                case 1:
                    System.out.println("\n\tCirculo");
                    System.out.printf ("Ingrese el radio del circulo: ");
                    c1.setRadio(sc.nextDouble()); // Establecer el radio del círculo

                    c1.calcularAreaCirculo(); // Calcular el área del círculo
                    c1.imprimirDatosCirculo(); // Imprimir los datos del círculo
                    break;

                case 2:
                    System.out.println("\n\tElipse");
                    System.out.println ("Ingrese el radio del elipse: ");
                    c1.setRadio(sc.nextDouble()); // Establecer el radio del elipse
                    System.out.println ("Ingrese el radio Secundario del elipse: ");
                    c1.setRadioSecundario(sc.nextDouble()); // Establecer el radio secundario del elipse

                    c1.calcularAreaElipse(); // Calcular el área del elipse
                    c1.imprimirDatosElipse(); // Imprimir los datos del elipse
                    break;
                case 3:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1, 2 o 3)."); // Mensaje de error para opción inválida
            }
        } while (op != 3); // Repetir hasta que el usuario decida regresar al menú principal
    }

    // Método para gestionar los triángulos
    public static void triangulos(){
        Scanner sc = new Scanner(System.in);
        Triangulos t1 = new Triangulos(); // Crear un objeto Triangulos
        int op;

        // Bucle do-while para mostrar el menú de triángulos hasta que el usuario decida regresar
        do {
            System.out.println("\nSeleccione el tipo de triangulo a calcular\n");
            System.out.println("\t1. Equilatero\n\t2. Isoceles\n\t3. Escaleno\n\t4. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op) {
                case 1:
                    System.out.println("\n\tTriangulo Equilatero");
                    System.out.println("Ingrese la medida de la base del triangulo");
                    t1.setBase(sc.nextDouble()); // Establecer la base del triángulo equilátero

                    t1.calcularDatosTrianguloEquilatero(); // Calcular los datos del triángulo equilátero
                    t1.imprimirDatosTrianguloEquilatero(); // Imprimir los datos del triángulo equilátero
                    break;
                case 2:
                    System.out.println("\n\tTriangulo Isoceles");
                    System.out.println("Ingrese la medida de la base del triangulo");
                    t1.setBase(sc.nextDouble()); // Establecer la base del triángulo isósceles
                    System.out.println("Ingrese la medida de la altura del triangulo");
                    t1.setAltura(sc.nextDouble()); // Establecer la altura del triángulo isósceles

                    t1.calcularDatosTriangulosIsoceles(); // Calcular los datos del triángulo isósceles
                    t1.imprimirDatosTrianguloIsoceles(); // Imprimir los datos del triángulo isósceles
                    break;
                case 3:
                    System.out.println("\n\tTriangulo Escaleno");
                    System.out.println("Ingrese la medida del lado 1 del triangulo");
                    t1.setLado1(sc.nextDouble()); // Establecer el lado 1 del triángulo escaleno
                    System.out.println("Ingrese la medida del lado 2 del triangulo");
                    t1.setLado2(sc.nextDouble()); // Establecer el lado 2 del triángulo escaleno
                    System.out.println("Ingrese la medida del lado 3 del triangulo");
                    t1.setLado3(sc.nextDouble()); // Establecer el lado 3 del triángulo escaleno

                    t1.calcularDatosTrianguloEscaleno(); // Calcular los datos del triángulo escaleno
                    t1.imprimirDatosTrianguloEscaleno(); // Imprimir los datos del triángulo escaleno
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...\n");
                    return; // Regresar al menú principal
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3 o 4)."); // Mensaje de error para opción inválida
            }
        } while (op != 4); // Repetir hasta que el usuario decida regresar al menú principal
    }

    // Método para gestionar los cuadriláteros
    public static void cuadrilateros() {
        Scanner sc = new Scanner(System.in);
        Cuadrilateros c1 = new Cuadrilateros(); // Crear un objeto Cuadrilateros
        int op;
        double lado, base, altura;

        // Bucle do-while para mostrar el menú de cuadriláteros hasta que el usuario decida regresar
        do {
            System.out.println("Seleccione la figura a calcular\n");
            System.out.println("\t1. Cuadrado\n\t2. Rectangulo\n\t3. Cuadrilatero Irregular\n\t4. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");

            // Validar la entrada del usuario para asegurarse de que es un entero
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt(); // Leer la opción del usuario

            // Evaluar la opción seleccionada por el usuario
            switch (op){
                case 1:
                    System.out.println("\n\tCuadrado");
                    System.out.println("Ingrese la logitud de un lado del cuadrado");
                    c1.setBase(sc.nextDouble()); // Establecer la base del cuadrado

                    c1.calcularDatosCuadrado(); // Calcular los datos del cuadrado
                    c1.imprimirdATOSCuadrado(); // Imprimir los datos del cuadrado
                    break;

                case 2:
                    System.out.println("\n\tRectangulo");
                    System.out.println("Ingrese la base del rectangulo");
                    c1.setBase(sc.nextDouble()); // Establecer la base del rectángulo
                    System.out.println("Ingrese la altura del rectangulo");
                    c1.setAltura(sc.nextDouble()); // Establecer la altura del rectángulo

                    c1.calcularDatosRectangulo(); // Calcular los datos del rectángulo
                    c1.imprimirDatosRectangulo(); // Imprimir los datos del rectángulo
                    break;

                case 3:
                    System.out.println("\n\tCuadrilatero Irregular");
                    System.out.println("Ingrese la longitud del lado 1: ");
                    c1.setLado1(sc.nextDouble()); // Establecer el lado 1 del cuadrilátero irregular
                    System.out.println("Ingrese la longitud del lado 2: ");
                    c1.setLado2(sc.nextDouble()); // Establecer el lado 2 del cuadrilátero irregular
                    System.out.println("Ingrese la longitud del lado 3: ");
                    c1.setLado3(sc.nextDouble()); // Establecer el lado 3 del cuadrilátero irregular
                    System.out.println("Ingrese la longitud del lado 4: ");
                    c1.setLado4(sc.nextDouble()); // Establecer el lado 4 del cuadrilátero irregular
                    System.out.println("Ingrese la longitud de la diagonal: ");
                    c1.setDiagonal(sc.nextDouble()); // Establecer la diagonal del cuadrilátero irregular

                    c1.calcularDatosCuadrilateroIrregular(); // Calcular los datos del cuadrilátero irregular
                    c1.ImprimirDatosCuadrilateroIrregular(); // Imprimir los datos del cuadrilátero irregular
                    break;
                case 4:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1, 2 o 3)."); // Mensaje de error para opción inválida
            }
        } while (op!=3); // Repetir hasta que el usuario decida regresar al menú principal
    }

    // Método para gestionar figuras de N lados
    public static void Nlados(){
        Scanner sc = new Scanner(System.in);
        nLados nlados1 = new nLados(); // Crear un objeto nLados
        int numlados;

        System.out.println("\nIngrese el numero de lados de su figura\n");
        numlados = sc.nextInt(); // Leer el número de lados

        // Validar el número de lados para asegurarse de que está entre 5 y 12
        while (numlados < 5 || numlados > 12){
            System.out.println("El numero de lados debe estar entre 5 y 12\nIngrese el dato de nuevo");
            numlados = sc.nextInt();
        }

        // Evaluar el número de lados y realizar los cálculos correspondientes
        if (numlados == 5) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calculaDatosPentagono(); // Calcular los datos del pentágono
            nlados1.imprimirDatosPentagono(); // Imprimir los datos del pentágono

        } else if (numlados == 6) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosHexagono(); // Calcular los datos del hexágono
            nlados1.imprimirDatosHexagono(); // Imprimir los datos del hexágono

        } else if (numlados == 7) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosHeptagono(); // Calcular los datos del heptágono
            nlados1.imprimirDatosHeptagono(); // Imprimir los datos del heptágono

        } else if (numlados == 8) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosOctagono(); // Calcular los datos del octágono
            nlados1.imprimirDatosOctagono(); // Imprimir los datos del octágono

        } else if (numlados == 9) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosnonagono(); // Calcular los datos del nonágono
            nlados1.imprimirDatosNonagono(); // Imprimir los datos del nonágono

        } else if (numlados == 10) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosdecagono(); // Calcular los datos del decágono
            nlados1.imprimirDatosDecagono(); // Imprimir los datos del decágono

        } else if (numlados == 11) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosendecagono(); // Calcular los datos del endecágono
            nlados1.imprimirDatosEndecagono(); // Imprimir los datos del endecágono

        } else if (numlados == 12) {
            System.out.println("Ingrese la medida del lado\n");
            nlados1.setTamlado(sc.nextDouble()); // Establecer la medida del lado
            nlados1.calcularDatosdodecagono(); // Calcular los datos del dodecágono
            nlados1.imprimirDatosDodecagono(); // Imprimir los datos del dodecágono
        }
    }

    // Método para gestionar las esferas
    public static void esferas(){
        Scanner sc = new Scanner(System.in);
        Tres_D esfera = new Tres_D(); // Crear un objeto Tres_D para la esfera
        System.out.println("Ingrese el radio de la esfera");
        esfera.setRadio(sc.nextDouble()); // Establecer el radio de la esfera

        esfera.calcularDatosEsfera(); // Calcular los datos de la esfera
        esfera.imprimirDatosEsfera(); // Imprimir los datos de la esfera
    }

    // Método para gestionar los cilindros
    public static void cilindros() {
        Scanner sc = new Scanner(System.in);
        Tres_D cilindro = new Tres_D(); // Crear un objeto Tres_D para el cilindro
        System.out.println("Ingrese el radio de la cilindro");
        cilindro.setRadio(sc.nextDouble()); // Establecer el radio del cilindro
        System.out.println("Ingrese la altura del cilindro");
        cilindro.setAltura(sc.nextDouble()); // Establecer la altura del cilindro

        cilindro.calcularDatosCilindro(); // Calcular los datos del cilindro
        cilindro.imprimirDatosCilindro(); // Imprimir los datos del cilindro
    }

    // Método para gestionar los cubos
    public static void cubos(){
        Scanner sc = new Scanner(System.in);
        Tres_D cubo = new Tres_D(); // Crear un objeto Tres_D para el cubo
        System.out.println("Ingrese el area de la cara de la cubo");
        cubo.setArea(sc.nextDouble()); // Establecer el área de la cara del cubo

        cubo.calcularDatosCubo(); // Calcular los datos del cubo
        cubo.imprimirDatosCubo(); // Imprimir los datos del cubo
    }

    // Método para gestionar las pirámides
    public static void Piramides () {
        Tres_D  p1 = new Tres_D(); // Crear un objeto Tres_D para la pirámide
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el area de la piramide: ");
        p1.setArea(sc.nextDouble()); // Establecer el área de la pirámide
        System.out.println("Ingrese el altura de la piramide: ");
        p1.setAltura(sc.nextDouble()); // Establecer la altura de la pirámide

        p1.calcularDatosPiramide(); // Calcular los datos de la pirámide
        p1.imprimirDatosPiramide(); // Imprimir los datos de la pirámide

    }

    // Método para gestionar los prismas
    public static void Prisma () {
        Tres_D  prisma = new Tres_D(); // Crear un objeto Tres_D para el prisma
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el area del prisma: ");
        prisma.setArea(sc.nextDouble()); // Establecer el área del prisma
        System.out.println("Ingrese el altura del prisma: ");
        prisma.setAltura(sc.nextDouble()); // Establecer la altura del prisma

        prisma.calcularDatosPrisma(); // Calcular los datos del prisma
        prisma.imprimirDatosPrisma(); // Imprimir los datos del prisma
    }

}
