package com.company.model;

/**
 * Created by Пользователь on 19.07.2017.
 */
public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {return name;}


    /**
     * Метод вычисления площади фигуры
     * @return площадь фигуры
     */
    public abstract double getSquare();

    /**
     * Метод вычисления периметра фигуры
     * @return периметр фигуры
     */
    public abstract double getPerimeter();
}