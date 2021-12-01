package com.company;
import java.util.Random;
public class Manager extends Employee{
    private double inc;
    Manager() {}
    public double getCell() {
        inc=(int)(115000+(140000-115000+1)*Math.random());
        return (105500+0.05*inc);
    }
    public double getinc() {
        return inc;
    }
}
