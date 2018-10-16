package com.example.task04;

public class Line {

    private Point P1;
    private Point P2;

    public Line(Point P1, Point P2){
        this.P1 = P1;
        this.P2 = P2;
    }

    public Point getP1(){
        return P1;
    }

    public Point getP2(){
        return P2;
    }

    public String toString() {
        return String.format("%s - %s", this.P1.toString(), this.P2.toString());
    }

    public boolean isCollinearLine(Point p){
        // (y1-y2)*x + (x2-x1)*y + (x1*y2-x2*x1) = 0
        return ((this.P1.y - this.P2.y) * p.x +
                (this.P2.x - this.P1.x) * p.y +
                (this.P1.x * this.P2.y - this.P2.x * this.P1.y) == 0);
    }
}