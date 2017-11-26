package com.yangrui;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Student {


    private String stuId;

    private String stuName;

    @JSONField(format="yyyy-MM-dd")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
