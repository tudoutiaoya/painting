package com.worker.bean;


public class Entry {
    private String name;        //姓名
    private String styleName;   //别名
    private String pseudonym;   //笔名
    private String country;     //国籍
    private String nation;      //民族
    private String ancestralHome; //家乡
    private String birthplace;      //出生地
    private String birthData;       //出生时间
    private String deadData;        //死亡时间
    private String occupation;   //职业
    private String sex;             //性别
    private String paintings;       //画作
    private String graduateSchool;  //毕业学校
    private String achievements;    //作品

    public Entry() {
    }

    public Entry(String name, String styleName, String pseudonym, String country, String nation, String ancestralHome, String birthplace, String birthData, String deadData, String occupation, String sex, String paintings, String graduateSchool, String achievements) {
        this.name = name;
        this.styleName = styleName;
        this.pseudonym = pseudonym;
        this.country = country;
        this.nation = nation;
        this.ancestralHome = ancestralHome;
        this.birthplace = birthplace;
        this.birthData = birthData;
        this.deadData = deadData;
        this.occupation = occupation;
        this.sex = sex;
        this.paintings = paintings;
        this.graduateSchool = graduateSchool;
        this.achievements = achievements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAncestralHome() {
        return ancestralHome;
    }

    public void setAncestralHome(String ancestralHome) {
        this.ancestralHome = ancestralHome;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBirthData() {
        return birthData;
    }

    public void setBirthData(String birthData) {
        this.birthData = birthData;
    }

    public String getDeadData() {
        return deadData;
    }

    public void setDeadData(String deadData) {
        this.deadData = deadData;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPaintings() {
        return paintings;
    }

    public void setPaintings(String paintings) {
        this.paintings = paintings;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", styleName='" + styleName + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", country='" + country + '\'' +
                ", nation='" + nation + '\'' +
                ", ancestralHome='" + ancestralHome + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", birthData='" + birthData + '\'' +
                ", deadData='" + deadData + '\'' +
                ", occupation='" + occupation + '\'' +
                ", sex='" + sex + '\'' +
                ", paintings='" + paintings + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                ", achievements='" + achievements + '\'' +
                '}';
    }
}
