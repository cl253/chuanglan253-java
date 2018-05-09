package com.chuanglan.model.response;
/**
 *
 * @author tianyh
 * @Description:账号余额响应实体类
 */
public class SmsBalanceResponse {
    /**
     * 响应时间
     */
    private String time;
    /**
     * 消息id
     */
    private String balance;
    /**
     * 状态码说明（成功返回空）
     */
    private String errorMsg;
    /**
     * 状态码（详细参考提交响应状态码）
     */
    private String code;
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String toString() {
        return "SmsBalanceResponse [time=" + time + ", balance=" + balance + ", errorMsg=" + errorMsg + ", code=" + code
                + "]";
    }
}
