public class Rectangle implements Area2D {
    private double w, l;

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double getArea() {
        return w * l;
    }

    @Override
    public void setWidth(double value) {
        this.w = value;
    }

    @Override
    public void setLength(double value) {
        this.l = value;
    }

}