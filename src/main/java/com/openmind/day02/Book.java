package com.openmind.day02;

/**
 * @Classname Book
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/27 9:17
 * @Created by Happy-微冷的雨
 */
public class Book{

    private Integer bookid;
    private String bookname;

    //重写Hashcode
    //HashCode就是一串字符
    @Override
    public int hashCode() {
        return this.bookid;
    }

    @Override
    public boolean equals(Object obj) {
        Book book=(Book)obj;
        if (this.getBookname().equals(book.getBookname())){
            return true;
        }else {
            return false;
        }
    }

    /*   @Override
            public String toString() {
                return "Book{" +
                        "bookid=" + bookid +
                        ", bookname='" + bookname + '\'' +
                        '}';
            }
        */
    public Book() {
    }

    public Book(Integer bookid, String bookname) {
        this.bookid = bookid;
        this.bookname = bookname;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
