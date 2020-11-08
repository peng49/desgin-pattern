package com.github.peng49.design.pattern.creational.simplefactory;

public class JavaVideo implements Video {
    private Double price;

    public JavaVideo(Double price){
        this.price = price;
    }

    @Override
    public void produce() {
        System.out.println("java " + price);
    }
}
