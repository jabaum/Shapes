package shapes;

public final class Line {

    private final int startX;
    private final int startY;

    private final int endX;
    private final int endY;

    public Line(final int startX, final int startY, final int endX, final int endY) {
        assert startX != endX || startY != endY;

        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getStartY() {
        return this.startY;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getEndY() {
        return this.endY;
    }

    public double getLength() {
        final int diffX = this.endX - this.startX;
        final int diffY = this.endY - this.startY;

        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    @Override
    public String toString() {
        return String.format(
            "(%d, %d) -- (%d, %d)",
            this.startX, this.startY,
            this.endX, this.endY
        );
    }

    public static boolean doLinesCross(final Line a, final Line b) {
        final int start =
            (a.getEndX() - a.getStartX()) * (b.getStartY() - a.getEndY())
            - (a.getEndY() - a.getStartY()) * (b.getStartX() - a.getEndX());
        final int end =
            (a.getEndX() - a.getStartX()) * (b.getEndY() - a.getEndY())
            - (a.getEndY() - a.getStartY()) * (b.getEndX() - a.getEndX());

        return !((start <= 0 && end <= 0) || (start >= 0 && end >= 0));
    }

}
