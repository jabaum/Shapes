package shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Polygon extends Shape {

    private final List<Line> lineSegments;

    public Polygon(final List<Line> lineSegments) {
        this(DEFAULT_X, DEFAULT_Y, lineSegments);
    }

    public Polygon(final int x, final int y, final List<Line> lineSegments) {
        super(x, y);

        assert lineSegments != null;
        assert formsPolygon(lineSegments);

        this.lineSegments = new ArrayList<>(lineSegments);
    }

    protected Polygon(final int x, final int y) {
        super(x, y);

        this.lineSegments = null;
    }

    public static boolean formsPolygon(final List<Line> lineSegments) {
        if (lineSegments.isEmpty())
            return false;

        Iterator<Line> segmentIterator = lineSegments.iterator();
        Line currentSegment = segmentIterator.next();
        int startX = currentSegment.getStartX();
        int startY = currentSegment.getStartY();
        int x = currentSegment.getEndX();
        int y = currentSegment.getEndY();

        while (segmentIterator.hasNext()) {
            currentSegment = segmentIterator.next();

            if (currentSegment.getStartX() != x || currentSegment.getStartY() != y)
                return false;

            x = currentSegment.getEndX();
            y = currentSegment.getEndY();
        }

        return x == startX && y == startY && isIntersectionFree(lineSegments);
    }

    public static boolean isIntersectionFree(final List<Line> lineSegments) {
        List<Line> checked = new ArrayList<>();

        for (final Line currentSegment : lineSegments) {
            for (final Line oldSegment : checked) {
                if (Line.doLinesCross(currentSegment, oldSegment))
                    return false;
            }

            checked.add(currentSegment);
        }

        return true;
    }

    public List<Line> getLineSegments() {
        return Collections.unmodifiableList(this.lineSegments);
    }

    @Override
    public double getCircumference() {
        // TODO implement this
        throw new UnsupportedOperationException();
    }

    @Override
    public double getArea() {
        int sum = this.lineSegments.stream()
            .mapToInt(l -> l.getStartX() * l.getEndY() - l.getStartY() * l.getEndX())
            .sum();

        return Math.abs(sum) / 2.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(
            String.format(
                "Polygon at (%d, %d) with line segments:\n",
                this.x, this.y
            )
        );
        for (final Line line : this.lineSegments) {
            sb.append('\t').append(line.toString()).append('\n');
        }

        return sb.toString();
    }

}
