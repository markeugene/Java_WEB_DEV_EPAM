package com.epam.jwd;

import java.util.Objects;

public class Square   {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public boolean isExist(){
        if((p1.equals(p2) || p2.equals(p3) || p3.equals(p1)||p4.equals(p1)||p2.equals(p4)||p3.equals(p4)))
        {
            return false;
        }
        else return true;

    }
    public boolean isFigure(){
        if((p1.equals(p2) || p2.equals(p3) || p3.equals(p1)||p4.equals(p1)||p2.equals(p4)||p3.equals(p4)))
        {
            return false;
        }
        else return true;

    }

    public double square() {
        if(isFigure()) {
            Line l1 = new Line(p1, p2);
            return l1.length()* l1.length();
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "Square{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(p1, square.p1) &&
                Objects.equals(p2, square.p2) &&
                Objects.equals(p3, square.p3) &&
                Objects.equals(p4, square.p4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2, p3, p4);
    }
}
