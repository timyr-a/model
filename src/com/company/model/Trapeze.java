package com.company.model;

/**
 * Created by Пользователь on 21.07.2017.
 */
public class Trapeze extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Trapeze(double sideA, double sideB, double sideC, double sideD ){
        setName("Трапеция");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideD() {
        return sideD;
    }

    /**
     * Метод вычисления периметра трапеции
     *
     * @return периметр трапеции
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC +sideD;
    }

    /**
     * Метод вычисления площади трапеции
     *
     * @return площадь трапеции
     */
    @Override
    public double getSquare() {
        return (sideA+sideB) / 2 * Math.sqrt(Math.pow(sideC,2)- Math.pow( (Math.pow((sideB-sideA),2)+ Math.pow(sideC,2)-Math.pow(sideD,2))/2*(sideB-sideA),2));
    }
}

