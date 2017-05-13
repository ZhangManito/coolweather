package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张国梁 on 2017/5/13.
 */

/**
 * 基本的信息类
 */
public class Basic {
//    @SerializedName让JSON字段和java字段之间建立映射关系

    /**
     * 城市名
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市对应的天气id
     */
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        /**
         * 天气更新的时间
         */
        @SerializedName("loc")
        public String updateTime;

    }
}
