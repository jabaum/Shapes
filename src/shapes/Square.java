package shapes;

public final class Square extends Rectangle {

    private final int length;

    public Square(final int length) {
        this(DEFAULT_X, DEFAULT_Y, length);
    }

    public Square(final int x, final int y, final int length) {
        super(x, y, true);

        assert length > 0;

        this.length = length;
    }

    public int getLength() {
        return this.length;
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
                "Square at (%d, %d) with:\n",
                this.x, this.y
            )
        );
        sb.append('\t').append("length: ").append(this.length).append('\n');

        return sb.toString();
    }

}
