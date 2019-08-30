package com.openmind.day06;

/**
 * @Classname BlogInfo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/29 12:29
 * @Created by Happy-微冷的雨
 */
public class BlogInfo {
    private Integer blogid;
    private String blogauthor;
    private String blogaddress;
    private Integer blogdel;

    @Override
    public String toString() {
        return "BlogInfo{" +
                "blogid=" + blogid +
                ", blogauthor='" + blogauthor + '\'' +
                ", blogaddress='" + blogaddress + '\'' +
                ", blogdel=" + blogdel +
                '}';
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogauthor() {
        return blogauthor;
    }

    public void setBlogauthor(String blogauthor) {
        this.blogauthor = blogauthor;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress;
    }

    public Integer getBlogdel() {
        return blogdel;
    }

    public void setBlogdel(Integer blogdel) {
        this.blogdel = blogdel;
    }
}
