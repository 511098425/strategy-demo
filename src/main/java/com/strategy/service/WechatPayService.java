package com.strategy.service;

import com.strategy.strategy.IStrategy;

/**
 * @author Mr.Chang
 * @create 2018-08-02 17:29
 **/
public class WechatPayService implements IStrategy {

    @Override
    public void updateBus() {
        System.out.println("===============WECAHTPAY===============");
    }
}
