package com.worker.bean;

import java.util.List;

/**
 * @Classname Painter
 * @Version 1.0.0
 * @Description TODO
 */
public class Author {
    private int identify = 0;
    private Integer id;
    private String des;
    private String entry;
    private String name;
    private String src;
    private List<Painting> relativePaintings;
    private List<Author> relativeAuthors;
    public Author() {
    }

    public List<Painting> getRelativePaintings() {
        return relativePaintings;
    }

    public void setRelativePaintings(List<Painting> relativePaintings) {
        this.relativePaintings = relativePaintings;
    }

    public Author(Integer id, String des, String entry, String name, String src) {
        this.id = id;
        this.des = des;
        this.entry = entry;
        this.name = name;
        this.src = src;
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
    }

    public List<Author> getRelativeAuthors() {
        return relativeAuthors;
    }

    public void setRelativeAuthors(List<Author> relativeAuthors) {
        this.relativeAuthors = relativeAuthors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", des='" + des + '\'' +
                ", entry='" + entry + '\'' +
                ", name='" + name + '\'' +
                ", src='" + src + '\'' +
                ", relativeAuthors=" + relativeAuthors +
                '}';
    }
}
