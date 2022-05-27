package com.worker.bean;

/**
 * @Classname NoFind
 * @Version 1.0.0
 * @Description TODO
 */
public class NoFind {
    private int identify = 2;
    private String notFount = "没有找到相应内容";

    public NoFind() {
    }

    public NoFind(String notFount) {
        this.notFount = notFount;
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
    }

    public String getNotFount() {
        return notFount;
    }

    public void setNotFount(String notFount) {
        this.notFount = notFount;
    }
}
