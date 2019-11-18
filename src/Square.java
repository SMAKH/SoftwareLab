public class Square implements Area2D {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return x * x;
    }

    private void setX(double value) {
        x = value;
    }

    @Override
    public void setWidth(double value) {
        setX(value);
    }

    @Override
    public void setLength(double value) {
        setX(value);
    }

}
