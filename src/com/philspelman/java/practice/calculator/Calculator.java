package com.philspelman.java.practice.calculator;

import java.io.Serializable;


class Calculator implements Serializable, CalculatorInterface{

//    private char operation;
    private double result;
    private double operandOne;
    private double operandTwo;

    public void setOperation(char operation) {
        this.operation = operation;
    }

    private char operation;



    public Calculator() {
//        this("No operation");
    }


    public double getResult() {
        return result;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }


    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    @Override
    public void performOperation() {
        if (this.operation == '+') {
            this.result = operandOne + operandTwo;
        } else if (operation == '-') {
            this.result = operandOne - operandTwo;
        } else {
            System.out.println("cannot perform that operation");
        }
    }

    @Override
    public double getResults() {
        return result;
    }
}


//
//public class Calculator implements CalculatorInterface, Serializable {
//
//    private double result;
//
//    public Calculator() {
//    }
//
//    @Override
//    public void performOperation(char operation) {
//    }
//
//    @Override
//    public double getResults() {
//        return 0;
//    }
//
//
//}
