package com.company.model;

/**
 * Created by Пользователь on 19.07.2017.
 */
public class Trianqle extends Figure {

    private  double sideA ;
    private  double sideB ;
    private  double sideC ;


    public Trianqle( double sideA, double sideB, double sideC) {
        super("Треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    /**
     * Метод вычисления периметра треугольника
     *
     * @return периметр треугольника
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Метод вычисления площади треугольника
     *
     * @return площадь треугольника
     */
    @Override
    public double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}


        /**
         * Метод вычисления площади треугольника
         *
         * @return площадь треугольника
         */

/*        @Override

        public double getSquare() {
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));


            /**
             * Метод вычисления периметра треугольника
             *
             * @return периметр треугольника
             */

  /*          @Override
            public double getPerimeter() {
                return sideA + sideB + sideC;
        }
}
*/