package com.epam.jwd;

import java.util.Objects;

public class Line {
   private Point p1;
   private Point p2;

   public Line(Point p1, Point p2) {
      this.p1 = p1;
      this.p2 = p2;
   }

   public boolean isFigure() {
      if(p1.equals(p2)){
         return false;
      }
      else return true;
   }

   public double length() {
      return  Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow((p1.getX()-p2.getY()),2));
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Line line = (Line) o;
      return Objects.equals(p1, line.p1) &&
              Objects.equals(p2, line.p2);
   }

   @Override
   public int hashCode() {
      return Objects.hash(p1, p2);
   }

   @Override
   public String toString() {
      return "Line{" +
              "p1=" + p1 +
              ", p2=" + p2 +
              '}';
   }
}
