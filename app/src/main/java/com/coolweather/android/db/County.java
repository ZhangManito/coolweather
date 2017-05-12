package com.coolweather.android.db;

/**
 * Created by 张国梁 on 2017/5/12.
 */

/**
 * 县类
 */
public class County {
    //县id
    private int id;
    //县名
    private String countyName;
    //县所对应的天气id
    private String weatherId;
    //当前所属的市（外键）
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
