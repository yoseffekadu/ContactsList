package com.example.Contacts;

import androidx.annotation.NonNull;

public class Actor {
    private String info;
    private String phoneNumber;
    //private String mail;

    public Actor(String info, String phoneNumber, String mail) {
        this.info = info;
        this.phoneNumber = phoneNumber;
        //this.mail = mail;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String fullName) {
        this.info = info;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //public String getMail() {
    ////    return mail;
    //}

    //public void setMail(String mail) {
     //   this.mail = mail;
    //}

    @NonNull
    @Override
    public String toString() {
        return info + "    " + phoneNumber;
    }
}
