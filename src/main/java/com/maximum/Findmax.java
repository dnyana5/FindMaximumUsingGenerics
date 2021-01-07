package com.maximum;

import java.util.Scanner;
public class Findmax {
    private static Integer max(Integer num1,Integer num2,Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        } return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] intArray = new Integer[3];
        System.out.println("Enter first number");
        intArray[0] = scanner.nextInt();
        System.out.println("Enter second number");
        intArray[1] = scanner.nextInt();
        System.out.println("Enter third number");
        intArray[2] = scanner.nextInt();
        System.out.println("Maximum:" + (max(intArray[0], intArray[1], intArray[2])));
    }

}
