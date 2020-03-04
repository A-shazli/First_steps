package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        value = input.nextInt();
        String str = String.valueOf(value);


        System.out.println("the int "+ value+" is converted to string "+str );

    }
}
