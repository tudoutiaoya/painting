package com.worker.model.domain;

public class Painting {
    private String id;
    private String authorName;
    private String paintingName;
    private String paintingSize;
    private String src;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPaintingName() {
        return paintingName;
    }

    public void setPaintingName(String paintingName) {
        if(!paintingName.equals("NULL")) {
            this.paintingName = paintingName;
        }
    }

    public String getPaintingSize() {
        return paintingSize;
    }

    public void setPaintingSize(String paintingSize) {
        this.paintingSize = paintingSize;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", paintingName='" + paintingName + '\'' +
                ", paintingSize='" + paintingSize + '\'' +
                ", src='" + src + '\'' +
                '}';
    }
}
