abstract class Shape {
    abstract double area();
}

interface Drawable {
    void draw();
}
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.1416 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println(s1.area());
        System.out.println(s2.area());

        Drawable d1 = new Circle(3);
        Drawable d2 = new Rectangle(2, 5);

        d1.draw();
        d2.draw();
    }
}
