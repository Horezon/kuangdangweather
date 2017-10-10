package com.kd.kuangdangweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king on 2017/10/10.
 */

public class City extends DataSupport {
    private int id;    //实体类的代号
    private String cityName;  //市名字
    private int cityCode;  //市的代号
    private int provinceId;//当前市所属省的id值

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

    public int getProvinceId(){
        return  provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }

}
