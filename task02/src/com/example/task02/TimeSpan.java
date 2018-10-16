package com.example.task02;


public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute % 60;
        this.second = second % 60;
    }

    public void add(TimeSpan time) {
        this.second += time.second;
        if (this.second > 60){
            this.minute += this.second /60;
            this.second %= 60;
        }
        this.minute += time.minute;
        if (this.minute > 60){
            this.hour += this.minute /60;
            this.minute %= 60;
        }
        this.hour += time.hour;
    }

    public void subtract(TimeSpan time) {
        this.second -= time.second;
        if (this.second < 0) {
            this.second += 60;
            this.minute--;
        }
        this.minute -= time.minute;
        if (this.minute < 0) {
            this.minute += 60;
            this.hour--;
        }
        this.hour -= time.hour;
        if (this.hour < 0){
            System.out.println("Error");
        }
    }

    public String toString(){
        return String.format("%d:%d:%d", this.hour, this.minute, this.second);
    }

    public int getHours() {
        return hour;
    }

    public int getMinutes() {
        return minute;
    }

    public int getSeconds() {
        return second;
    }

    public void setHours(int hours) {
        this.hour = hours;
    }

    public void setMinutes(int minutes) {
        this.minute = minutes % 60;
    }

    public void setSeconds(int seconds) {
        this.second = seconds % 60;
    }
}