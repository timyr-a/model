package com.company.model;

/**
 * Created by Пользователь on 20.07.2017.
 */

public class EqualTrianqle extends IsoTrianqle {
    public EqualTrianqle(double side) {
        super(side, side);
        setName("Равносторонний треугольник");
    }

    public double getPerimeter(){
        return getSideA() * 3;
    }

    public double getSquare(){
        return Math.sqrt(3) * Math.pow(getSideA(), 2) / 4;
    }

}
