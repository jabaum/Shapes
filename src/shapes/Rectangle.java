package shapes;

public class Rectangle extends Polygon {

    private final int width;
    private final int height;

    public Rectangle(final int width, final int height) {
        this(DEFAULT_X, DEFAULT_Y, width, height);
    }

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);

        assert width > 0 && height > 0;

        this.width = width;
        this.height = height;
    }

    protected Rectangle(final int x, final int y, final boolean passthrough) {
        super(x, y);

        this.width = 0;
        this.height = 0;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double getCircumference() {
        // TODO implement this
        throw new UnsupportedOperationException();
    }

    @Override
    public double getArea() {
        // TODO implement this
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(
            String.format(
                "Rectangle at (%d, %d) with:\n",
                this.x, this.y
            )
        );
        sb.append('\t').append("width: ").append(this.width).append('\n');
        sb.append('\t').append("height: ").append(this.height).append('\n');

        return sb.toString();
    }

}
