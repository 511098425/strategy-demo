package com.strategy.context;

import com.strategy.factory.StrategyFactory;
import com.strategy.strategy.IStrategy;

/**
 * @author Mr.Chang
 * @create 2018-08-02 16:57
 **/
public class Context {

    private IStrategy strategy;

    public void updateBus(String payType) {
        strategy =  StrategyFactory.getInstance().creator(payType);
        strategy.updateBus();
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
