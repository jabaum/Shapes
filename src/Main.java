import shapes.*;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    public static void main(final String[] args) {
        List<Line> seg = new ArrayList<>();
        seg.add(new Line(0, 0, 2, 0));
        seg.add(new Line(2, 0, 1, 2));
        seg.add(new Line(1, 2, 0, 0));
        Shape triangle = new Polygon(0, 0, seg);

        System.out.println(triangle.toString());

        System.out.println("Circumference: " + triangle.getCircumference());
        System.out.println("Area: " + triangle.getArea());

        System.out.println();

        seg = new ArrayList<>();
        seg.add(new Line(0, 0, 1, 0));
        seg.add(new Line(1, 0, 1, 1));
        seg.add(new Line(1, 1, 0, 1));
        seg.add(new Line(0, 1, 0, 0));
        Shape square = new Polygon(0, 0, seg);

        System.out.println(square.toString());

        System.out.println("Circumference: " + square.getCircumference());
        System.out.println("Area: " + square.getArea());

        System.out.println();

        Shape rectangle = new Rectangle(0, 0, 1, 2);

        System.out.println(rectangle.toString());

        System.out.println("Circumference: " + rectangle.getCircumference());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println();

        Shape realSquare = new Square(0, 0, 2);

        System.out.println(realSquare.toString());

        System.out.println("Circumference: " + realSquare.getCircumference());
        System.out.println("Area: " + realSquare.getArea());
    }

}
