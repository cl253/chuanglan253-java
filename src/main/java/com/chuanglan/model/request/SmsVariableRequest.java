package com.chuanglan.model.request;

public class SmsVariableRequest {
    /**
     * 创蓝API账号，必填
     */
    private final String account;

    /**
     * 创蓝API密码，必填
     */
    private final String password;

    /**
     * 短信内容。长度不能超过536个字符，必填
     */
    private final String msg;

    /**
     * 手机号码和变量参数，多组参数使用英文分号;区分，必填
     */
    private final String params;

    /**
     * 定时发送短信时间。格式为yyyyMMddHHmm，值小于或等于当前时间则立即发送，默认立即发送，选填
     */
    private final String sendTime;

    /**
     * 是否需要状态报告（默认false），选填
     */
    private final String report;

    /**
     * 下发短信号码扩展码，纯数字，建议1-3位，选填
     */
    private final String extend;

    /**
     * 该条短信在业务系统内的ID，如订单号或者短信发送记录流水号，选填
     */
    private final String uid;

    public static class Builder {
        private final String account;
        private final String password;
        private final String msg;
        private final String params;
        private String sendTime;
        private String report;
        private String extend;
        private String uid;

        public Builder(String account, String password, String msg, String params) {
            this.account = account;
            this.password = password;
            this.msg = msg;
            this.params = params;
        }

        public Builder setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        public Builder setReport(String report) {
            this.report = report;
            return this;
        }

        public Builder setExtend(String extend) {
            this.extend = extend;
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public SmsVariableRequest build() {
            return new SmsVariableRequest(this);
        }
    }

    private SmsVariableRequest(Builder builder) {
        account = builder.account;
        password = builder.password;
        msg = builder.msg;
        params = builder.params;
        sendTime = builder.sendTime;
        report = builder.report;
        extend = builder.extend;
        uid = builder.uid;
    }
}
