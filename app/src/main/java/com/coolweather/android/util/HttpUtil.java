package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 张国梁 on 2017/5/12.
 */

/**
 * 服务器请求类
 */
public class HttpUtil {
    /**
     * Http请求方法
     * @param address url的地址
     * @param callback response回掉处理服务器响应
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
