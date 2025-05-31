package com.back;

public class Calc {
    public static int run(String exp) {
        String[] inputs = exp.split("\\s\\+\\s");
        int number1 = Integer.parseInt(inputs[0]);
        int number2 = Integer.parseInt(inputs[1]);

        return number1 + number2;
    }
}
