package org.springframework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        String resultStr = String.valueOf(value);
        String resultText = "!" + resultStr + " = 1";

        int resultInt = 1;

        for(int i = 2; i < value + 1; i++) {

            resultInt = resultInt * i;
            resultStr = String.valueOf(i);
            resultText = resultText + " * " + resultStr;
        }
            System.out.println(resultText + " = " + resultInt);
    }
}