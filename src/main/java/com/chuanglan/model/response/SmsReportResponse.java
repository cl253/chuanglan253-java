package com.chuanglan.model.response;
import java.util.List;

/**
 *
 * @author tianyh
 * @Description:状态报告响应实体类
 */
public class SmsReportResponse {
    /**
     * 请求状态
     */
    private String ret;
    /**
     * 请求错误描述
     */
    private String error;
    /**
     * 上行明细结果
     */
    private List<Result> result;



    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
    static class Result{
        /**
         * 消息ID
         */
        private String msgId;
        /**
         * 状态更新时间
         */
        private String reportTime;
        /**
         * 接收短信的手机号码
         */
        private String mobile;
        /**
         * 状态（详细参考状态报告状态码）
         */
        private String status;
        /**
         * 状态说明
         */
        private String statusDesc;
        /**
         * 拉取个数
         */
        private String count;
        public String getMsgId() {
            return msgId;
        }
        public void setMsgId(String msgId) {
            this.msgId = msgId;
        }
        public String getReportTime() {
            return reportTime;
        }
        public void setReportTime(String reportTime) {
            this.reportTime = reportTime;
        }
        public String getMobile() {
            return mobile;
        }
        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public String getStatusDesc() {
            return statusDesc;
        }
        public void setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
        }
        public String getCount() {
            return count;
        }
        public void setCount(String count) {
            this.count = count;
        }



    }
}
