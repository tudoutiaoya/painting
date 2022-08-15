package com.worker.model.vo;

import com.worker.model.domain.Painting;
import com.worker.model.domain.PaintingStyle;
import com.worker.model.domain.Poem;
import com.worker.model.domain.Seal;

import java.util.List;

public class AuthorVo {
    private String id;
    private String authorDes;
    private String authorName;
    private String src;
    private String birthDate;
    private String country;
    private String deadDate;
    private String hao;
    private String zi;
    private String area;
    private List<Painting> paintings;
    private List<Poem> poems;
    private List<Seal> seals;
    private List<PaintingStyle> goodAtStyles;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(List<Painting> paintings) {
        this.paintings = paintings;
    }

    public List<Poem> getPoems() {
        return poems;
    }

    public void setPoems(List<Poem> poems) {
        this.poems = poems;
    }

    public List<Seal> getSeals() {
        return seals;
    }

    public void setSeals(List<Seal> seals) {
        this.seals = seals;
    }

    public List<PaintingStyle> getGoodAtStyles() {
        return goodAtStyles;
    }

    public void setGoodAtStyles(List<PaintingStyle> goodAtStyles) {
        this.goodAtStyles = goodAtStyles;
    }

    @Override
    public String toString() {
        return "AuthorVo{" +
                "id='" + id + '\'' +
                ", authorDes='" + authorDes + '\'' +
                ", authorName='" + authorName + '\'' +
                ", src='" + src + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", country='" + country + '\'' +
                ", deadDate='" + deadDate + '\'' +
                ", hao='" + hao + '\'' +
                ", zi='" + zi + '\'' +
                ", area='" + area + '\'' +
                ", paintings=" + paintings +
                ", poems=" + poems +
                ", seals=" + seals +
                ", goodAtStyles=" + goodAtStyles +
                '}';
    }
}
