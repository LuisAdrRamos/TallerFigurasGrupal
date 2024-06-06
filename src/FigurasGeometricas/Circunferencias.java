package FigurasGeometricas;

// La clase Circunferencias hereda de Otras_Figuras, utilizando herencia simple.
public class Circunferencias extends Otras_Figuras {
    // Definición de los atributos específicos de la clase Circunferencias.
    double radio;
    double radioSecundario;

    // Constructor por defecto que no inicializa los atributos.
    public Circunferencias() {
    }

    // Constructor que inicializa el atributo radio.
    public Circunferencias(double radio) {
        this.radio = radio;
        this.radioSecundario = radioSecundario;
    }

    // Método getter para obtener el valor del radio.
    public double getRadio() {
        return radio;
    }

    // Método setter para establecer el valor del radio.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método getter para obtener el valor del radio secundario.
    public double getRadioSecundario() {
        return radioSecundario;
    }

    // Método setter para establecer el valor del radio secundario.
    public void setRadioSecundario(double radioSecundario) {
        this.radioSecundario = radioSecundario;
    }

    // Método para calcular el área del círculo.
    public double calcularAreaCirculo() {
        // Calculo del área del círculo utilizando la fórmula πr^2.
        area = Math.PI * radio * radio;
        // Calculo del perímetro del círculo utilizando la fórmula 2πr.
        perimetro = 2 * Math.PI * radio;
        // Retorna el área calculada.
        return area;
    }

    // Método para imprimir los datos del círculo.
    public void imprimirDatosCirculo() {
        // Imprime el área del círculo.
        System.out.println("El area del Circulo es: " + getArea());
        // Imprime el perímetro del círculo.
        System.out.println("El perimetro del circulo es: " + getPerimetro());
    }

    // Método para calcular el área de la elipse.
    public double calcularAreaElipse() {
        // Calculo del área de la elipse utilizando la fórmula πab.
        area = Math.PI * radio * radioSecundario;
        // Calculo del perímetro de la elipse utilizando una fórmula aproximada.
        perimetro = 2 * Math.PI * (Math.sqrt((Math.pow(radio, 2) + Math.pow(radioSecundario, 2)) / 2));
        // Retorna el área calculada.
        return area;
    }

    // Método para imprimir los datos de la elipse.
    public void imprimirDatosElipse() {
        // Imprime el área de la elipse.
        System.out.println("El area de la elipse: " + getArea());
        // Imprime el perímetro de la elipse.
        System.out.println("El perimetro de la elipse: " + getPerimetro());
    }
}

//Polimorfismo:
//El polimorfismo permite que un objeto de una subclase pueda ser tratado como un objeto de una superclase.
// Esto es útil cuando tienes una colección de objetos de la superclase y quieres llamar a métodos que han
// sido sobrescritos por la subclase. Aunque el código proporcionado no muestra un ejemplo explícito de polimorfismo,
// se puede utilizar en el siguiente contexto:

//Otras_Figuras figura = new Circunferencias();
//figura.calcularArea(); // Si calcularArea es un método en Otras_Figuras y sobrescrito en Circunferencias.