package com.example.greekband;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private String mUserName;
    private int mAge;

    public String getmUserName() {
        return mUserName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public UserInfo(String mUserName, int mAge) {
        this.mUserName = mUserName;
        this.mAge = mAge;
    }
}
