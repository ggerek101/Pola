package com.matiko101;

/**
 * Created by mateusz on 2016-05-31.
 */
public class Rectangle extends Figure
{
    public Rectangle(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double calculateField() {
        return (a * h) / 2;
    }
}
