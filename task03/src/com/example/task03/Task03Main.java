package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    ComplexNumber n1 = new ComplexNumber(2, 15);
    ComplexNumber n2 = new ComplexNumber( -2, -21);
    String res1 = ComplexNumber.mul(n1, n2).toString();
    System.out.println(res1);
    String res2 = ComplexNumber.sum(n1, n2).toString();
    System.out.println(res2);
    String res3 = ComplexNumber.sub(n1, n2).toString();
    System.out.println(res3);
    }
}
