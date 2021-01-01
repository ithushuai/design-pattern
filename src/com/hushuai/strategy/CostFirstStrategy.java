package com.hushuai.strategy;

/**
 * created by it_hushuai
 * 2021/1/1 20:21
 */
public class CostFirstStrategy implements RouteStrategy {
    @Override
    public String route() {
        return "A - C - E - B";
    }
}
