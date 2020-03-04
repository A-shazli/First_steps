package com.company;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner take = new Scanner(System.in);
        double n1, n2, answer = 0;
        int a;

        System.out.println("BY CHOOSING ANY NUMBER FROM THE ONES PROVIDED BELOW, YOU WILL PERFORM THE OPERATION CORRESPONDING TO IT");
        System.out.println("  ");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        System.out.println("5.MODULUS(REMAINDER)");


        a = take.nextInt();
        System.out.println("");

        if (a == 1) {
            System.out.print("Enter the first number: ");
            n1 = take.nextDouble();
            System.out.println("");
            System.out.print("Enter the second number: ");
            n2 = take.nextDouble();
            answer = n1 + n2;
            System.out.println("");
            System.out.println(n1 + " + " + n2 + " = " + answer );



        } else if (a == 2){
            System.out.print("Enter the first number: ");
            n1 = take.nextDouble();
            System.out.println("");
            System.out.print("Enter the second number: ");
            n2 = take.nextDouble();
            answer = n1 - n2;
            System.out.println("");
            System.out.println(n1 + " - " + n2 + " = " + answer );


        } else if(a == 3) {
            System.out.print("Enter the first number: ");
            n1 = take.nextDouble();
            System.out.println("");
            System.out.print("Enter the second number: ");
            n2 = take.nextDouble();
            answer = n1 * n2;
            System.out.println("");
            System.out.println(n1 + " * " + n2 + " = " + answer );


        } else if(a == 4){
            System.out.print("Enter the first number: ");
            n1 = take.nextDouble();
            System.out.println("");
            System.out.print("Enter the second number: " );
            n2 = take.nextDouble();
            answer = n1 / n2;
            System.out.println("");
            System.out.println(n1 + " / " + n2 + " = " + answer );


        } else if(a == 5){
            System.out.print("Enter the first number: ");
            n1 = take.nextDouble();
            System.out.println("");
            System.out.print("Enter the second number: ");
            n2 = take.nextDouble();
            answer = n1 % n2;
            System.out.println("");
            System.out.println(n1 + " % " + n2 + " = " + answer );
        }
        System.out.println("THE REQUIRED ANSWER IS " +  answer);        

        












    }
}


