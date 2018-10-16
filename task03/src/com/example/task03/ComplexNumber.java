package com.example.task03;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(int real){
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber sum(ComplexNumber n1, ComplexNumber n2){
        int real = n1.real + n2.real;
        int imaginary = n1.imaginary + n2.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber mul(ComplexNumber n1, ComplexNumber n2) {
        int real = n1.real * n2.real - n1.imaginary * n2.imaginary;
        int imagionary = n1.real * n2.imaginary + n1.imaginary * n2.real;
        return new ComplexNumber(real, imagionary);
    }

    public static ComplexNumber sub(ComplexNumber n1, ComplexNumber n2){
        int real = n1.real - n2.real;
        int imaginary = n1.imaginary - n2.imaginary;
        return new ComplexNumber(real, imaginary);
    }
    public String toString() {
        if (imaginary > 0 && real != 0)
            return String.format("%d+%di", real, imaginary);
        if (imaginary < 0 && real != 0)
            return String.format("%d%di", real, imaginary);
        if (imaginary == 0 && real != 0)
            return String.format("%d", real);
        else
            return String.format("%di", imaginary);
    }
}
