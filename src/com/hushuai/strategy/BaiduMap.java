package com.hushuai.strategy;

/**
 * created by it_hushuai
 * 2021/1/1 20:09
 */
public class BaiduMap {
    public void startNavigate(RouteStrategy strategy) {
        String route = strategy.route();
        System.out.println(route);
    }
}
