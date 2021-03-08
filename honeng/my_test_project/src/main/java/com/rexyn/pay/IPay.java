package com.rexyn.pay;

/**
 *支付接口
 * @author sheldon
 */
public interface IPay {
    Boolean support(String code);
    /**支付方法
     * @return 支付结果
     */
    String pay();
}
