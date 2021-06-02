package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : circle, area: " + String.format("%.2f", getArea())
                + " sq.units, radius: " + String.format("%.0f", getRadius())
                + " units, color: " + getColor());
    }
}
