package com.epam.jwd;

public class FigureFactory {
    Line createLine(Point p1, Point p2){
        return new Line(p1,p2);
    }
    Triangle createTriangle(Point p1, Point p2, Point p3){
        return  new Triangle(p1, p2, p3);
    }
    Square createSquare(Point p1, Point p2, Point p3, Point p4){
        return new Square(p1,p2,p3,p4);
    }

}
