package com.example.superletter;

/**
 * @author xushunyu
 */
public class UserInfo {
    private String phone;
    private String pwd;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public UserInfo(String phone, String pwd) {
        this.phone = phone;
        this.pwd = pwd;
    }
    public UserInfo(){

    }
}
