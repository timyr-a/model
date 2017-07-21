package com.company.model;

/**
 * Created by Пользователь on 20.07.2017.
 */
public class IsoTrianqle extends Trianqle {
    public IsoTrianqle(double side, double base) {
        super(side, side, base);
        setName("Равнобедренный треугольник");
    }

    public double getPerimeter(){
        return getSideA() * 2 + getSideC();
    }

    public double getSquare(){
        return getSideC()/2 * Math.sqrt((getSideA()+getSideC()/2) *(getSideA()-getSideC()/2));

         /*
        double h = Math.sqrt(Math.pow(getSideA(), 2) - Math.pow(getSideC(), 2) / 4);
        return getSideC() * h / 2;*/
    }


}
