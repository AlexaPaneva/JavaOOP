package javaOOP.JavaOOP.polyporphism.shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4.5, 5.3);
        System.out.println(shape.getArea());

        shape = new Circle(10d);

    }

}
