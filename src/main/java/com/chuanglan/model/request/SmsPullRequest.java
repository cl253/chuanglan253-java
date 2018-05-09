package com.chuanglan.model.request;
/**
 * @author tianyh
 * @Description:查询上行短信实体类
 */
public class SmsPullRequest {
    /**
     * 用户账号，必填
     */
    private String account;
    /**
     * 用户密码，必填
     */
    private String password;
    /**
     * 拉取个数（最大100，默认20），选填
     */
    private String count;

    public SmsPullRequest() {

    }
    public SmsPullRequest(String account, String password,String count) {
        super();
        this.account = account;
        this.password = password;
        this.count = count;

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
    public String getCount() {
        return count;
    }
    public void setCount(String count) {
        this.count = count;
    }
}
