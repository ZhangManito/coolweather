package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张国梁 on 2017/5/13.
 */

/**
 * 当前天气信息类
 */
public class Now {
    /**
     * 气温
     */
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        /**
         * 天气情况
         */
        @SerializedName("txt")
        public String info;
    }
}
