package com.hushuai.strategy;

/**
 * created by it_hushuai
 * 2021/1/1 20:19
 */
public class TimeFirstStrategy implements RouteStrategy {
    @Override
    public String route() {
        return "A - C - B";
    }
}
