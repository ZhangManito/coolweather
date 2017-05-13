package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张国梁 on 2017/5/13.
 */

/**
 * 天气建议类
 */
public class Suggestion {
    /**
     * 天气舒适情况
     */
    @SerializedName("comf")
    public Comfort comfort;

    /**
     * 洗车情况
     */
    @SerializedName("cw")
    public CarWash carWash;

    /**
     * 运动情况
     */
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
