package com.hushuai.strategy;

/**
 * created by it_hushuai
 * 2021/1/1 20:22
 */
public class StrategyTest {
    public static void main(String[] args) {

        // 使用百度地图
        BaiduMap map = new BaiduMap();
        // 选择时间优先路线
        map.startNavigate(new TimeFirstStrategy());
        // 距离优先路线
        map.startNavigate(new DistanceFirstStrategy());
        // 费用最少路线
        map.startNavigate(new CostFirstStrategy());
    }
}
