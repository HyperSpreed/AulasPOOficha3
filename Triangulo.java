public class Triangulo {

    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public Triangulo() {
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
    }

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }

    public double calculaAreaTriangulo(){
        double area = ((p1.getX() * (p2.getY() - p3.getY())) + (p2.getX() * (p3.getY() - p1.getY())) + (p3.getX() * (p1.getY() - p2.getY()))) / 2.0;
        return area;
    }

    public double calculaPerimetroTriangulo(){
        double perimetro = p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);
        return perimetro;
    }

}
