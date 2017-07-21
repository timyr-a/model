package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.print("Введите стороны треугольника: ");
        Trianqle triangle = new Trianqle(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(triangle);

        System.out.print("Введите катеты прямоугольного треугольника: ");
        RightTrianqle rightTriangle = new RightTrianqle(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(rightTriangle);

        System.out.print("Введите боковую сторону и основание равнобедренного треугольника: ");
        IsoTrianqle isoTriangle = new IsoTrianqle(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(isoTriangle);

        System.out.print("Введите сторону равностороннего треугольника: ");
        EqualTrianqle equalTriangle = new EqualTrianqle(
                scanner.nextDouble()
        );
        printFigureInfo(equalTriangle);

        System.out.print("Введите большую и малую оси эллипса: ");
        Ellipse ellipse = new Ellipse(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(ellipse);

        System.out.print("Введите диаметр окружности: ");
        Circle circle = new Circle(
                scanner.nextDouble()
        );
        printFigureInfo(circle);      */

        System.out.print("Введите стороны трапеции: ");
        Trapeze trapeze = new Trapeze(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(trapeze);

    }

    private static void printFigureInfo(Figure figure){
        System.out.println(figure.getName());
        System.out.printf("Периметр: %.2f\n", figure.getPerimeter());
        System.out.printf("Площадь: %.2f\n", figure.getSquare());
    }

}