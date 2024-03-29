package com.blog.entity.base;

import com.blog.entity.Content;
import com.blog.entity.UserCategory;
import com.blog.entity.UserExt;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * 用户实体抽象类
 */
@MappedSuperclass
public abstract class BaseUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;
    private String nikeName;
    private String email;
    private String password;
    private String salt;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private String loginCount;
    private String validateCode;
    private Integer score;

    @OneToMany(mappedBy = "user")
    private Collection<Content> contents;

    @OneToMany(mappedBy = "user")
    private Collection<UserCategory> userCategories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserExt userExt;

    public BaseUser() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Collection<Content> getContents() {
        return contents;
    }

    public void setContents(Collection<Content> contents) {
        this.contents = contents;
    }

    public Collection<UserCategory> getUserCategories() {
        return userCategories;
    }

    public void setUserCategories(Collection<UserCategory> userCategories) {
        this.userCategories = userCategories;
    }

    public UserExt getUserExt() {
        return userExt;
    }

    public void setUserExt(UserExt userExt) {
        this.userExt = userExt;
    }
}
