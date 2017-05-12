package com.coolweather.android.db;

/**
 * Created by 张国梁 on 2017/5/12.
 */

/**
 * 市类
 */
public class City {
    //市id
    private int id;
    //市名
    private String cityName;
    //市代号
    private int cityCode;
    //当前所属省代号（外键）
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
