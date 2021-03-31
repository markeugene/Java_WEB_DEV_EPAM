package com.epam.jwd;

import java.util.Objects;

public class Triangle  {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2= p2;
        this.p3 = p3;
    }


    public boolean isFigure() {
        if((p1.equals(p2) || p2.equals(p3) || p3.equals(p1))){
            return false;
        };
       return true;
    }



    public double perimetr() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(p1, triangle.p1) &&
                Objects.equals(p2, triangle.p2) &&
                Objects.equals(p3, triangle.p3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2, p3);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
