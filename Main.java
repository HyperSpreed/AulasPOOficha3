
public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(0,0,1);

        Circulo circulo2 = new Circulo(circulo1);

        circulo2.alteraCentro(1.0,1.0);

        double area = circulo2.areaCirculo();
        double perimetro = circulo2.perimetroCirculo();

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        System.out.println(circulo2);

        Ponto p1 = new Ponto(0,0);
        Ponto p2 = new Ponto(3,7);
        Ponto p3 = new Ponto(5,14);

        Triangulo triangulo = new Triangulo(p1, p2, p3);

        double areaTriangulo = triangulo.calculaAreaTriangulo();

        double perimetroTriangulo = triangulo.calculaPerimetroTriangulo();

        System.out.println("Area: " + areaTriangulo);

        System.out.println("Perimetro: " + perimetroTriangulo);
    }
}
