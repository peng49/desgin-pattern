package com.github.peng49.design.pattern.creational.simplefactory;

public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("python");
    }
}
