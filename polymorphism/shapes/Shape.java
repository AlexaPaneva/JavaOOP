package javaOOP.JavaOOP.polymorphism.shapes;

public abstract class Shape {
    private Double perimeter;
    private Double  area;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
