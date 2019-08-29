package com.openmind.day05;

/**
 * @Classname StudentBean
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 14:50
 * @Created by Happy-微冷的雨
 */
public class StudentBean {

    private Integer stuid;
    private String stuname;

    public StudentBean() {
    }

    public StudentBean(Integer stuid, String stuname) {
        this.stuid = stuid;
        this.stuname = stuname;
    }


    @Override
    public String toString() {
        return "StudentBean{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                '}';
    }

    public String homework(String type){
        System.out.println("do some homework====="+type);
        return "作业";
    }
    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
}
