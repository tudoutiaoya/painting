package com.worker.model.domain;

public class Seal {
    private String id;
    private String seal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    @Override
    public String toString() {
        return "Seal{" +
                "id='" + id + '\'' +
                ", seal='" + seal + '\'' +
                '}';
    }
}
