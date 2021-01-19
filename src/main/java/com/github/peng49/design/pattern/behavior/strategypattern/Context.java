package com.github.peng49.design.pattern.behavior.strategypattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.doOperation(a, b);
    }
}
