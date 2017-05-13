package com.coolweather.android.gson;

/**
 * Created by 张国梁 on 2017/5/13.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 天气类
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    
}
