package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        String str = input.next();
        Integer result = Integer.parseInt(str);
        System.out.println(result);
        //if the string does not contain a parsable integer
        //a number format exception will result

    }


}
