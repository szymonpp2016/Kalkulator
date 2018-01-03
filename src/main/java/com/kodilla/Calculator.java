package com.kodilla;

public class Calculator {

        public int addAToB(int a, int b) {
        return a + b;
    }

        public int substractAFromB(int a, int b) {
        return a - b;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        int i = calculator.addAToB(3, 5);
        System.out.println("Wynik:" + i);
    }

}
