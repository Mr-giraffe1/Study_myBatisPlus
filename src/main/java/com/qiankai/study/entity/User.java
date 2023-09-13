package com.qiankai.study.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String name;

    private String pwd;

    private String delflg;

    private Date createtime;

    private Date updatetime;

    private String comments;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name == null ? null : name.trim();
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd == null ? null : pwd.trim();
//    }
//
//    public String getDelflg() {
//        return delflg;
//    }
//
//    public void setDelflg(String delflg) {
//        this.delflg = delflg == null ? null : delflg.trim();
//    }
//
//    public Date getCreatetime() {
//        return createtime;
//    }
//
//    public void setCreatetime(Date createtime) {
//        this.createtime = createtime;
//    }
//
//    public Date getUpdatatime() {
//        return updatatime;
//    }
//
//    public void setUpdatatime(Date updatatime) {
//        this.updatatime = updatatime;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments == null ? null : comments.trim();
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", delflg='" + delflg + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", comments='" + comments + '\'' +
                '}';
    }
}