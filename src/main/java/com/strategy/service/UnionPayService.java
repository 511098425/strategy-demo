package com.strategy.service;

import com.strategy.strategy.IStrategy;

/**
 * 银联
 *
 * @author Mr.Chang
 * @create 2018-08-03 9:35
 **/
public class UnionPayService implements IStrategy {
    @Override
    public void updateBus() {
        System.out.println("==================UNIONPAY==================");
    }
}
