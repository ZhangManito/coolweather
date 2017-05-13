package com.coolweather.android.gson;

/**
 * Created by 张国梁 on 2017/5/13.
 */

/**
 * 空气质量指数类
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
