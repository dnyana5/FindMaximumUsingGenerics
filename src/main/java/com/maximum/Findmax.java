package com.maximum;

import java.util.Arrays;

public class Findmax<T extends Comparable<T>> {
    private T first, second, third, fourth;

    public Findmax(T first, T second, T third, T fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public Findmax() {
        // TODO Auto-generated constructor stub
    }

    public T testMaximum() {
        return Findmax.testMaximum(first, second, third, fourth);
    }

    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third, T fourth) {
        T max = first;
        if (second.compareTo(max) > 0)
            max = second;
        if (third.compareTo(max) > 0)
            max = third;
        if (fourth.compareTo(max) > 0)
            max = fourth;
        printMax(first, second, third, fourth, max);
        return max;
    }

    public static <T> void printMax(T first, T second, T third, T fourth, T max) {

        System.out.printf("Max of %s, %s, %s and %s is %s\n", first, second, third, fourth, max);
       }

    public static void main(String[] args) {
        Integer[] intArray = { 6, 2, 1, 4 };
        Float[] floatArray = { 4.224f, 3.364f, 2.365f, 7.134f };
        String[] stringArray = { "Apples", "Peach", "Banana", "Orange" };
        new Findmax<Integer>(intArray[0], intArray[1], intArray[2], intArray[3]).testMaximum();
        new Findmax<Float>(floatArray[0], floatArray[1], floatArray[2], floatArray[3]).testMaximum();
        new Findmax<String>(stringArray[0], stringArray[1], stringArray[2], stringArray[3]).testMaximum();
    }

}
