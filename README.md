# chuanglan253-java-sdk
==========================

[创蓝](https://www.253.com/) SDK

## 快速开始

- 添加Maven依赖

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.28</version>
</dependency>
```

- 使用SmsSendDemo.java
  1.填写API账号,API密码,接口地址,手机号码
  2.运行main函数

```java
    // 用户平台API账号(非登录账号,示例:N1234567)
    public static String account = "";
    // 用户平台API密码(非登录密码)
    public static String password = "";
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        //请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
        String smsSingleRequestServerUrl = "https://xxx/msg/send/json";
        // 短信内容
        String msg = "【253云通讯】你好,你的验证码是123456";
        //手机号码
        String phone = "159********";
        //状态报告
        String report= "true";

        SmsSendRequest smsSingleRequest = new SmsSendRequest(account, password, msg, phone,report);

        String requestJson = JSON.toJSONString(smsSingleRequest);

        System.out.println("before request string is: " + requestJson);

        String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);

        System.out.println("response after request result is :" + response);

        SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);

        System.out.println("response  toString is :" + smsSingleResponse);
    }
```

## 源码说明 chuanglan253-java-sdk
- 工程使用maven构造，jdk1.7 or higher
- 开发API可参考单元测试 docx/253云通讯PaaS短信云接口说明（JSON版）.docx

## 文档链接
- [api文档](https://www.253.com/#/document/1)

## 客服链接
- [创蓝客服 链接](https://kefu253.udesk.cn/im_client/?web_plugin_id=47820={"name":"github"})
