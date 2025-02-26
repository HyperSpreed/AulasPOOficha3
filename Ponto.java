public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto ponto){
        this.x = ponto.getX();
        this.y = ponto.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Ponto outroPonto) {
        double dx = outroPonto.getX() - getX();
        double dy = outroPonto.getY() - getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
