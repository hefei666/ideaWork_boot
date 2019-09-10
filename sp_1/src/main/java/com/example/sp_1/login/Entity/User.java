package com.example.sp_1.login.Entity;

public class User {
    private String account_id;

    private String user_name ;

    private String password;

    private String tel;

    private String mail;

    private String gender;
    
    private String rec_status;

    private String rec_person;

    private String rec_time;

    private String rec_updateperson;

    private String rec_updatetime;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getRec_status() {
        return rec_status;
    }

    public void setRec_status(String rec_status) {
        this.rec_status = rec_status;
    }

    public String getRec_person() {
        return rec_person;
    }

    public void setRec_person(String rec_person) {
        this.rec_person = rec_person;
    }

    public String getRec_time() {
        return rec_time;
    }

    public void setRec_time(String rec_time) {
        this.rec_time = rec_time;
    }

    public String getRec_updateperson() {
        return rec_updateperson;
    }

    public void setRec_updateperson(String rec_updateperson) {
        this.rec_updateperson = rec_updateperson;
    }

    public String getRec_updatetime() {
        return rec_updatetime;
    }

    public void setRec_updatetime(String rec_updatetime) {
        this.rec_updatetime = rec_updatetime;
    }
}