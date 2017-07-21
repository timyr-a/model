package com.company.model;

/**
 * Created by Пользователь on 20.07.2017.
 */

    public class RightTrianqle extends Trianqle {

        public RightTrianqle(double sideA, double sideB) {
            super(sideA, sideB, Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
            setName("Прямоугольный треугольник");
        }

        public double getSquare(){
            return getSideA() * getSideB() / 2;
        }

    }



