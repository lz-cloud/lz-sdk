package com.wkclz.sdk.domain.pay;

import com.wkclz.core.base.BaseModel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: pay_order (支付-订单)
 */

@Data
public class PayOrder extends BaseModel {

    /**
     * ID
     */
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 微信openId
     */
    private String openId;

    /**
     * 订单号
     */
    private String outTradeNo;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 支付金额
     */
    private BigDecimal paymentAmount;

    /**
     * 公众账号ID	
     */
    private String appid;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 设备号
     */
    private String deviceInfo;

    /**
     * 随机字符串
     */
    private String nonceStr;

    /**
     * 签名类型
     */
    private String signType;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 交易类型:JSAPI,NATIVE,APP
     */
    private String tradeType;

    /**
     * 终端类型
     */
    private String terminalType;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 支付流水号
     */
    private String payFlowNo;

    /**
     * 支付方式
     */
    private String payMethod;

    /**
     * 支付时间
     */
    private Date payTime;



    /**
     * 字符编码格式
     */
    private String charset;

    /**
     * 支付页面
     */
    private String htmlBody;

}
