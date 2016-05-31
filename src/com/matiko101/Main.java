package com.matiko101;

public class Main
{
    public static void main(String[] args)
    {
        Figure figure;

        figure = new Square(10,10,3);
        System.out.print(figure.calculateField());

        figure = new Rectangle(40,10,55);
        System.out.print(figure.calculateField());
    }
}
