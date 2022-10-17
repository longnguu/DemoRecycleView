package com.example.demorecycleview;

import android.graphics.Bitmap;

public class Computer {
    String name,mota;
    int ihinh;
    Bitmap bhinh;

    public Computer(String name, String mota, int ihinh, Bitmap bhinh) {
        this.name = name;
        this.mota = mota;
        this.ihinh = ihinh;
        this.bhinh = bhinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getIhinh() {
        return ihinh;
    }

    public void setIhinh(int ihinh) {
        this.ihinh = ihinh;
    }

    public Bitmap getBhinh() {
        return bhinh;
    }

    public void setBhinh(Bitmap bhinh) {
        this.bhinh = bhinh;
    }
}

