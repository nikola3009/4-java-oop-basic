package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(11, 34, 34);
        TimeSpan t2 = new TimeSpan(2,45,45);
        System.out.println(t1.toString());
        t1.add(t2);
        System.out.println(t1.toString());
        t1.subtract(t2);
        System.out.println(t1.toString());
    }
}
