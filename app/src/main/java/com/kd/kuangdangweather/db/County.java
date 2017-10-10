package com.kd.kuangdangweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king on 2017/10/10.
 */

public class County extends DataSupport {
    private int id;  //实体类代码
    private String countyName;  //县名字
    private String weatherId;    //县代号
    private int cityId;   //所属市的代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }

    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }

}
