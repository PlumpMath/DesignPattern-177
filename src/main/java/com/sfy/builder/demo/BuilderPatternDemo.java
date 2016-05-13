package com.sfy.builder.demo;

/**
 * @Description: BuilderPatternDemo.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:"+nonVegMeal.getCost());
    }

}
