package com.antipin;

import com.antipin.util.GeometryUtils;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 10);
        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        //changes from 1.1.0
        triangle.setColor("red");
        circle.setColor("blue");
        rectangle.setColor("black");

        System.out.println(GeometryUtils.compareAreas(triangle, circle));
        System.out.println(GeometryUtils.comparePerimeters(circle, triangle));
    }
}