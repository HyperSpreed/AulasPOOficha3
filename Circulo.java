import java.util.Objects;

public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(){
        this.centro = new Ponto();
        this.raio = 0.0;
    }

    public Circulo(double x, double y, double raio){
        this.centro = new Ponto(x,y);
        this.raio = raio;
    }

    public Circulo(Circulo circulo){
        this.centro = circulo.getCentro();
        this.raio = circulo.getRaio();
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y){
        this.centro.setX(x);
        this.centro.setY(y);
    }

    public double areaCirculo(){
        double area = Math.PI * Math.pow(this.getRaio(), 2);
        return area;
    }

    public double perimetroCirculo(){
        double perimetro = 2 * Math.PI * this.getRaio();
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", raio=" + raio +
                '}';
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(raio, circulo.raio) == 0 && Objects.equals(centro, circulo.centro);
    }

}
