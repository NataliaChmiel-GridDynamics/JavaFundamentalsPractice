package com.griddynamics.nchmiel.javafundamentals.DataTypes;

import java.util.Scanner;

public class StringPrinting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));


    }
}