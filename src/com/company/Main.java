package com.company;


import com.company.model.Trianqle;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите стороны треугольника: ");
        Scanner scanner = new  Scanner (System.in);
        Trianqle trianqle = new Trianqle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());

        System.out.printf("Периьетр треугольника %.2f\n", trianqle.getPerimeter());
        System.out.printf("Площадь треугольника %.2f",trianqle.getSquare());


    }
}
