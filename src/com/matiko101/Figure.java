package com.matiko101;

/**
 * Created by mateusz on 2016-05-31.
 */
public abstract class Figure
{
    double a,b,h;

    public Figure(double a, double b, double h)
    {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public abstract double calculateField();
}
