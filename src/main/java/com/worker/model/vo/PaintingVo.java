package com.worker.model.vo;

import com.worker.model.domain.Poem;
import com.worker.model.domain.Seal;

import java.util.List;

public class PaintingVo {
    private String id;
    private String authorName;
    private String paintingName;
    private String paintingSize;
    private String src;
    private String type;
    private String style;
    private List<Poem> peoms;
    private List<Seal> seals;

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
        this.paintingName = paintingName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<Poem> getPeoms() {
        return peoms;
    }

    public void setPeoms(List<Poem> peoms) {
        this.peoms = peoms;
    }

    public List<Seal> getSeals() {
        return seals;
    }

    public void setSeals(List<Seal> seals) {
        this.seals = seals;
    }

    @Override
    public String toString() {
        return "PaintingVo{" +
                "id='" + id + '\'' +
                ", authorName='" + authorName + '\'' +
                ", paintingName='" + paintingName + '\'' +
                ", paintingSize='" + paintingSize + '\'' +
                ", src='" + src + '\'' +
                ", type='" + type + '\'' +
                ", style='" + style + '\'' +
                ", peoms=" + peoms +
                ", seals=" + seals +
                '}';
    }
}
