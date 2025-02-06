package com.csc205.project1;

public class Point
{
    private double x;
    private double y;

    // Default constructor that sets x and y to 0
    public Point()
    {
        this (0, 0);
    }

    // Constructor that takes x and y cords as double args
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //Set methods
    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // Get methods
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    // Sets the cords of the point
    public void setPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Shifts the x cord by n
    public void shiftX(double n)
    {
        this.x += n;
    }

    // Shifts the y cord by n
    public void shiftY(double n)
    {
        this.y += n;
    }

    // Finds the distance to point p2
    public double distance(Point p2)
    {
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    // Rotates point about radian
    public void rotate(double angle)
    {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // toString method
    @Override
    public String toString()
    {
        return "Point(" + "x = " + x + " , y = " + y + ")";
    }
}
