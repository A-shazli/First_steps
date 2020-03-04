package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s,i,j;
        for(i =1; i<=10; i++){

            for(j = 1; j<=i;j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}

