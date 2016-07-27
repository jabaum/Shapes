package shapes;

public abstract class Shape {

    protected final static int DEFAULT_X = 0;
    protected final static int DEFAULT_Y = 0;

    protected final int x;
    protected final int y;

    protected Shape() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public abstract double getCircumference();

    public abstract double getArea();

    @Override
    public abstract String toString();

}
