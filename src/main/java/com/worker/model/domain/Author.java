package com.worker.model.domain;

public class Author {
    private String id;
    private String authorDes;
    private String authorName;
    private String src;
    private String birthDate;
    private String country;
    private String deadDate;
    private String hao;
    private String zi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorDes() {
        return authorDes;
    }

    public void setAuthorDes(String authorDes) {
        this.authorDes = authorDes;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate;
    }

    public String getHao() {
        return hao;
    }

    public void setHao(String hao) {
        this.hao = hao;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorDes='" + authorDes + '\'' +
                ", authorName='" + authorName + '\'' +
                ", src='" + src + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", country='" + country + '\'' +
                ", deadDate='" + deadDate + '\'' +
                ", hao='" + hao + '\'' +
                ", zi='" + zi + '\'' +
                '}';
    }
}
