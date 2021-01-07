package com.maximum;

public class Findmax <T extends Comparable<T>> {
    private T first,second,third;

    public Findmax(T first,T second,T third) {
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public Findmax() {
        // TODO Auto-generated constructor stub
    }
    public T Max() {
        return Findmax.testMaximum(first, second, third);
    }

    public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
        T max = first;
        if (second.compareTo(max) > 0)
            max = second;
        if (third.compareTo(max) > 0)
            max = third;
        return max;
    }


    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        Float[] floatArray = { 1.224f, 3.364f, 4.365f };
        String[] stringArray = { "Apples", "Peach", "Banana" };

        System.out.println("max integer--" + new Findmax<Integer>(intArray[0], intArray[1], intArray[2]).Max());
        System.out.println("max float--" + new Findmax<Float>(floatArray[0], floatArray[1], floatArray[2]).Max());
        System.out.println("max String--" + new Findmax<String>(stringArray[0], stringArray[1], stringArray[2]).Max());
    }

}


