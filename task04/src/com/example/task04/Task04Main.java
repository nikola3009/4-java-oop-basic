package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Line l1 = new Line(new Point(-2, 1), new Point (0,3));
        Point P3 = new Point(-7, -3);
        System.out.println( l1.isCollinearLine(P3));
        System.out.println(l1.toString());
    }
}
