package javaOOP.JavaOOP.reflection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class reflectionClass = Reflection.class;
        System.out.println(reflectionClass.toString());
        System.out.println(reflectionClass.getSuperclass().toString());
    }
}
