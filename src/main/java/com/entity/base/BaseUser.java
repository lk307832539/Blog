package com.entity.base;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by LK on 2017/5/7.
 */
public abstract class BaseUser implements Serializable {
    private int userId;
    private String userName;
    private String nikeName;
    private String email;
    private String password;
    private String salt;
    private Timestamp registerTime;
    private String registerIp;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private String loginCount;
    private String validateCode;
    private Byte regiestType;
    private Integer score;
    private Collection<BaseContent> contents;
    private Collection<BaseUserCategory> userCategories;
    private BaseUserExt userExt;

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

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
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

    public Byte getRegiestType() {
        return regiestType;
    }

    public void setRegiestType(Byte regiestType) {
        this.regiestType = regiestType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Collection<BaseContent> getContents() {
        return contents;
    }

    public void setContents(Collection<BaseContent> contents) {
        this.contents = contents;
    }

    public Collection<BaseUserCategory> getUserCategories() {
        return userCategories;
    }

    public void setUserCategories(Collection<BaseUserCategory> userCategories) {
        this.userCategories = userCategories;
    }

    public BaseUserExt getUserExt() {
        return userExt;
    }

    public void setUserExt(BaseUserExt userExt) {
        this.userExt = userExt;
    }
}