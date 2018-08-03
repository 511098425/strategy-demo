package com.strategy.service;

import com.strategy.context.Context;
import com.strategy.enums.PayTypeEnum;

/**
 * @author Mr.Chang
 * @create 2018-08-02 17:31
 **/
public class JudgePayService {


    public static void main(String[] args) {
        Context context = new Context();
        context.updateBus(PayTypeEnum.ALIPAY.getValue());
        context.updateBus(PayTypeEnum.WECHAT.getValue());
        context.updateBus(PayTypeEnum.UNION.getValue());
    }

}
