package com.cbsgenesis.trainsmanagementsystem.view;

/**
 * Created by beClever on 29.11.16.
 */
public class Outer {
    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    class Inner{
        void printI(){
            Outer outer = new Outer();
            outer.getI();
        }
    }
}
