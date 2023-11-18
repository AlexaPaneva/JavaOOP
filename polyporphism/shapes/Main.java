package javaOOP.JavaOOP.polyporphism.shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangles(4, 5);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }

}
