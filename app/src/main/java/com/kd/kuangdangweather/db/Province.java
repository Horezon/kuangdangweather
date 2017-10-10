package com.kd.kuangdangweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king on 2017/10/10.
 */

public class Province extends DataSupport {   //LitePal中的每个实体类都必须继承自DataSupport
    private int id;  //记录Id
    private String provinceName;  //记录省的名字
    private int provinceCode;//记录省的代号
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName(){
        return  provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
