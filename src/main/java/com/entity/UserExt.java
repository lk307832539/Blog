package com.entity;

import java.sql.Date;

/**
 * Created by LK on 2017/5/7.
 */
public class UserExt {
    private int userId;
    private String userImg;
    private String nickName;
    private String realName;
    private Date birthday;
    private String sex;
    private String wechat;
    private String qq;
    private String address;
    private String profession;
    private String intro;
    private User user;
    private User userByUserId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserExt userExt = (UserExt) o;

        if (userId != userExt.userId) return false;
        if (userImg != null ? !userImg.equals(userExt.userImg) : userExt.userImg != null) return false;
        if (nickName != null ? !nickName.equals(userExt.nickName) : userExt.nickName != null) return false;
        if (realName != null ? !realName.equals(userExt.realName) : userExt.realName != null) return false;
        if (birthday != null ? !birthday.equals(userExt.birthday) : userExt.birthday != null) return false;
        if (sex != null ? !sex.equals(userExt.sex) : userExt.sex != null) return false;
        if (wechat != null ? !wechat.equals(userExt.wechat) : userExt.wechat != null) return false;
        if (qq != null ? !qq.equals(userExt.qq) : userExt.qq != null) return false;
        if (address != null ? !address.equals(userExt.address) : userExt.address != null) return false;
        if (profession != null ? !profession.equals(userExt.profession) : userExt.profession != null) return false;
        if (intro != null ? !intro.equals(userExt.intro) : userExt.intro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userImg != null ? userImg.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (wechat != null ? wechat.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
