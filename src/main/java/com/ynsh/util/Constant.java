package com.ynsh.util;

/**
 * Created by syb on 2017/9/24.
 */
public class Constant {

//    public static String AppId = "wx79dd40363c8fbd8a"; //个人微信公众号
    public static String AppId = "wxb750bae6f917ceb5"; //公司微信公众号

//    public static String AppSecret = "d02bc4868925ecafef20b35700e845b7";  //个人微信公众号
    public static String AppSecret = "b427efd7016c63badc5c7bed71289788";  //公司微信公众号

    public static String JsCode = "";

    public static String GrantType = "authorization_code";

    public static final String OPEN_ID_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
//    public static final String OPEN_ID_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

}
