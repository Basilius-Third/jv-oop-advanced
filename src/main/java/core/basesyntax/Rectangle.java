package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : rectangle, area: " + String.format("%.2f", getArea())
                    + " sq.units, length: " + String.format("%.0f", getWidth())
                    + " units, width: " + String.format("%.0f", getLength())
                    + " units, color: " + getColor());
    }
}
