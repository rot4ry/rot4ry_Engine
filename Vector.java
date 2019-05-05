package rot4ry_Engine;

import rot4ry_Engine.Point;
import java.util.Scanner;
import java.math.*;

public class Vector{

    private Point pointA;
    private Point pointB;

    private int dimensionX;
    private int dimensionY;
    
    private double Vlength;

    public Vector(int a, int b, int c, int d){
        pointA = new Point(a,b);
        pointB = new Point(c,d);
        dimensionX = c - a;
        dimensionY = d - b;
    }

    public int getX(){
        return this.dimensionX;
    }

    public int getY(){
        return this.dimensionY;
    }
    
    public Point getStartingPoint(){
        return this.pointA;
    }

    public void printValues(){
        pointA.printValues();
        pointB.printValues();
        System.out.println("Dimension X = " + this.dimensionX);
        System.out.println("Dimension Y = " + this.dimensionY);
    }

}