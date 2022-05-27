package com.worker.bean;

import java.util.List;

/**
 * @Classname Pating
 * @Version 1.0.0
 * @Description TODO
 */
public class Painting {
    private int identify = 1;
    private Integer id;
    private String src;
    private String des;
    private String name;
    private String size;
    private String authorName;
    private String authorDes;
    private String poem;
    private String seal;
    private List<Painting> relativePaintings;

    public List<Painting> getRelativePaintings() {
        return relativePaintings;
    }

    public void setRelativePaintings(List<Painting> relativePaintings) {
        this.relativePaintings = relativePaintings;
    }

    public Painting() {
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
    }

    public Painting(Integer id, String src, String des, String name, String size, String authorName, String authorDes, String poem, String seal) {
        this.id = id;
        this.src = src;
        this.des = des;
        this.name = name;
        this.size = size;
        this.authorName = authorName;
        this.authorDes = authorDes;
        this.poem = poem;
        this.seal = seal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDes() {
        return authorDes;
    }

    public void setAuthorDes(String authorDes) {
        this.authorDes = authorDes;
    }

    public String getPoem() {
        return poem;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "id=" + id +
                ", src='" + src + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
