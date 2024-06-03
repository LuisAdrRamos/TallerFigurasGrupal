package FigurasGeometricas;

public class Tres_D extends FIGURASGEOMETRICAS{
    int num_caras;
    double aristas;
    double volumen;
    double area;
    double radio;

    public Tres_D() {
    }
    public Tres_D(int num_caras, double aristas) {
        this.num_caras = num_caras;
        this.aristas = aristas;
        this.volumen = volumen;
        this.area = area;
        this.radio = radio;
    }

    public int getNum_caras() {
        return num_caras;
    }

    public void setNum_caras(int num_caras) {
        this.num_caras = num_caras;
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcularVolumen() {
        System.out.println("Calculando volumen de Figuras 3D");
        return volumen;
    }

    public double calcularDatosEsfera(){
        volumen= ((4*Math.PI*Math.pow(radio,3))/3);
        return volumen;
    }
    public void imprimirDatosEsfera(){
        System.out.println("El volumen la esfera es: " + getVolumen());
    }

    public double calcularDatosCilindro(){
        volumen= (Math.PI*Math.pow(radio,2)*altura);
        return volumen;
    }
    public void imprimirDatosCilindro(){
        System.out.println("El volumen del cilindro es: " + getVolumen());
    }

    public double calcularDatosCubo(){
        volumen = Math.pow(area, 3);
        return volumen;
    }
    public void imprimirDatosCubo(){
        System.out.println("El volumen del cubo es: " + getVolumen());
    }

    public double calcularDatosPiramide(){
        volumen=((area*altura)/3);
        return volumen;
    }
    public void imprimirDatosPiramide(){
        System.out.println("El volumen de la piramide es: " + getVolumen());
    }

    public double calcularDatosPrisma(){
        volumen=(area*altura);
        return volumen;
    }
    public void imprimirDatosPrisma(){
        System.out.println("El volumen de la prisma es: " + getVolumen());
    }
}
