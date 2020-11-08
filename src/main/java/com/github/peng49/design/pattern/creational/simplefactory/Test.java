package com.github.peng49.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        try {
            VideoFactory.getVideo(PythonVideo.class).produce();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
