package com.wei.Model;

import java.util.Date;

public class Sturesult {
    private Integer id;

    private String stuid;

    private String whichlesson;

    private Integer ressingle;

    private Integer resmore;

    private Integer restotal;

    private Date jointime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getWhichlesson() {
        return whichlesson;
    }

    public void setWhichlesson(String whichlesson) {
        this.whichlesson = whichlesson == null ? null : whichlesson.trim();
    }

    public Integer getRessingle() {
        return ressingle;
    }

    public void setRessingle(Integer ressingle) {
        this.ressingle = ressingle;
    }

    public Integer getResmore() {
        return resmore;
    }

    public void setResmore(Integer resmore) {
        this.resmore = resmore;
    }

    public Integer getRestotal() {
        return restotal;
    }

    public void setRestotal(Integer restotal) {
        this.restotal = restotal;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }
}