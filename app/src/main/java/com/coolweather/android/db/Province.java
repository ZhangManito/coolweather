package com.coolweather.android.db;

/**
 * Created by 张国梁 on 2017/5/12.
 */

import org.litepal.crud.DataSupport;

/**
 * 省 类
 */
public class Province extends DataSupport{
    //省id
    private int id;
    //省名
    private String provinceName;
    //省代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
