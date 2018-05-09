package com.chuanglan.model.request;
/**
 * @author tianyh
 * @Description:查询账号余额实体类
 */
public class SmsBalanceRequest {
    /**
     * 用户账号，必填
     */
    private String account;
    /**
     * 用户密码，必填
     */
    private String password;

    public SmsBalanceRequest() {

    }
    public SmsBalanceRequest(String account, String password) {
        super();
        this.account = account;
        this.password = password;

    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
