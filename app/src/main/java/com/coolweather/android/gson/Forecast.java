package com.coolweather.android.gson;

/**
 * Created by 张国梁 on 2017/5/13.
 */

import com.google.gson.annotations.SerializedName;

/**
 * 预报类
 */
public class Forecast {
    /**
     *日期
     */
    public String date;
    /**
     * 气温
     */
    @SerializedName("tmp")
    public Temperature temperature;
    /**
     * 天气情况
     */
    @SerializedName("cond")
    public More more;


    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
