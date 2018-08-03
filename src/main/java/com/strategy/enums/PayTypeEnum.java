package com.strategy.enums;

/**
 * 支付方式枚举
 *
 * @author Mr.Chang
 * @create 2018-08-03 9:09
 **/
public enum PayTypeEnum {

    ALIPAY("ALIPAY","支付宝"),
    WECHAT("WECHAT","微信"),
    UNION("UNION","银联");

    private String value;
    private String description;

    PayTypeEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
