package com.worker.model.domain;

public class Area {
    private String id;
    private String reginon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReginon() {
        return reginon;
    }

    public void setReginon(String reginon) {
        this.reginon = reginon;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id='" + id + '\'' +
                ", reginon='" + reginon + '\'' +
                '}';
    }
}
