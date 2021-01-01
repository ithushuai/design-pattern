package com.hushuai.strategy;

/**
 * created by it_hushuai
 * 2021/1/1 20:20
 */
public class DistanceFirstStrategy implements RouteStrategy {
    @Override
    public String route() {
        return "A - D - B";
    }
}
