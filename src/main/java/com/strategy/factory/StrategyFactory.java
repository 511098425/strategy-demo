package com.strategy.factory;

import com.strategy.enums.PayTypeEnum;
import com.strategy.service.AlipayService;
import com.strategy.service.WechatPayService;
import com.strategy.strategy.IStrategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略工厂
 *
 * @author Mr.Chang
 * @create 2018-08-03 9:13
 **/
public class StrategyFactory {

    private static StrategyFactory strategyFactory = new StrategyFactory();
    private static Map strategyMap= new ConcurrentHashMap();

    static {
        strategyMap.put(PayTypeEnum.ALIPAY.getValue(), new AlipayService());
        strategyMap.put(PayTypeEnum.WECHAT.getValue(), new WechatPayService());
        strategyMap.put(PayTypeEnum.UNION.getValue(), new AlipayService());
    }

    public IStrategy creator(String payType){
        return (IStrategy) strategyMap.get(payType);
    }

    public StrategyFactory() {
    }

    public static StrategyFactory getInstance(){
        return strategyFactory;
    }
}
