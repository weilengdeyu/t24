package com.openmind.day06;

import java.util.Date;

/**
 * @Classname HomeWork
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/29 14:57
 * @Created by Happy-微冷的雨
 */
public class HomeWork {
    private Integer homeid;
    private String homegrade;
    private String hometeacher;
    private String homechapter;
    private String homecontent;
    private Date hometime;

    @Override
    public String toString() {
        return "HomeWork{" +
                "homeid=" + homeid +
                ", homegrade='" + homegrade + '\'' +
                ", hometeacher='" + hometeacher + '\'' +
                ", homechapter='" + homechapter + '\'' +
                ", homecontent='" + homecontent + '\'' +
                ", hometime=" + hometime +
                '}';
    }

    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public String getHomegrade() {
        return homegrade;
    }

    public void setHomegrade(String homegrade) {
        this.homegrade = homegrade;
    }

    public String getHometeacher() {
        return hometeacher;
    }

    public void setHometeacher(String hometeacher) {
        this.hometeacher = hometeacher;
    }

    public String getHomechapter() {
        return homechapter;
    }

    public void setHomechapter(String homechapter) {
        this.homechapter = homechapter;
    }

    public String getHomecontent() {
        return homecontent;
    }

    public void setHomecontent(String homecontent) {
        this.homecontent = homecontent;
    }

    public Date getHometime() {
        return hometime;
    }

    public void setHometime(Date hometime) {
        this.hometime = hometime;
    }
}
