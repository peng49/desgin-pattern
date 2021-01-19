package com.github.peng49.design.pattern.behavior.strategypattern;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
