package com.epam.jwd;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;


public class Main{

   private static Point points[] = new Point[4];

   private static Line lines[] = new Line[2];

   private static Triangle triangles[] = new Triangle[2];

   private  static Square squares[] = new Square[1];
   private static final Logger LOGGER= LogManager.getLogger(Main.class.getName());
   static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {

        menu();
        int j=0;
        do {

                if (points[j] == null) {
                    throw new NullPointerException("This element " + j + " of array Points are empty");
                }
                LOGGER.info(points[j].toString());
                j++;
            }
        while(j<points.length);

        for (int i = 0; i <lines.length;i++) {
            if(lines[i]==null) {
                throw new NullPointerException("This element "+i+" of array Lines are empty");
            }

            LOGGER.info(lines[i].toString());
        }
        for (int i=0;i<triangles.length;i++) {
            if(triangles[i]==null) {
                throw new NullPointerException("This element "+i+" of array Triangles are empty");
            }
            if(triangles[i].isFigure()) {
                LOGGER.info(triangles[i].toString());
            }
            else{
                LOGGER.error("Triangle "+i+" with parametrs: "+triangles[i].toString()+" cant exist");
            }
        }
        if(squares[0].isFigure()){
        LOGGER.info(squares[0].toString());
        }
        else{
            LOGGER.error("Such square cant exist!");
        }


    }
   private static void  menu(){
        int x1,y1;

       PointFactory creatorPoint= new PointFactory();
       FigureFactory creatorFigure=new FigureFactory();

       boolean q=false;
       while(!q) {
           LOGGER.info("Choice what to u want to do:");
           LOGGER.info("1. Create array of POINTS:");
           LOGGER.info("2. Create LINE");
           LOGGER.info("3. Create TRIANGLE");
           LOGGER.info("4. Create SQUARE");
           LOGGER.info("5. Exit");
           int k=input.nextInt();
           switch (k) {

               case 1:
                   if (points[3] == null) {
                       for (int i = 0; i < 4; i++) {
                           LOGGER.info("Input x,y: ");
                           points[i] = creatorPoint.createPoint(x1 = input.nextInt(), y1 = input.nextInt());
                       }
                   }
                   break;
               case 2:
                   LOGGER.info("Creating Lines");
                   if (lines[1] == null) {
                       for (int i = 0; i < 2; i++) {
                           lines[i] = creatorFigure.createLine(points[i], points[3]);
                       }
                   }
                   break;
               case 3:
                   LOGGER.info("Creating Triangles");
                   if (triangles[1] == null) {
                       for (int i = 0; i < 2; i++) {

                           triangles[i] = creatorFigure.createTriangle(points[i], points[i + 1], points[i + 2]);
                       }
                   }break;
               case 4:
                   LOGGER.info("Creating Square");
                   squares[0] = creatorFigure.createSquare(points[0], points[1], points[2], points[3]);
                   break;
               case 5:
                   LOGGER.info("Finnaly end of creating!");
                   q=false;
                   return;
               default:
                   LOGGER.error("Input error! Try again.");


           }
       }


    }
}

