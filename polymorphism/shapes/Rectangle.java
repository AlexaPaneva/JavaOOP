package javaOOP.JavaOOP.polymorphism.shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        super.setArea(height * width);
        return super.getArea();
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2 * height + 2 * width);
        return super.getPerimeter();
    }
}
