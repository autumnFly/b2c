package com.csair.b2c.cloud.test.user.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created on 2019/1/13.<br/>
 *
 * @author yudong
 */
public class FilmActor implements Serializable {
    private static final long serialVersionUID = 2014346681457476500L;
    private Integer actorId;
    private Integer filmId;
    private Date lastUpate;
    public static void main(String[] args) {
        System.out.println("/M00/5A/5A/wKgwb1w1X8uAacqsAAKpJ8OhKA0583.jpg".startsWith("/"));
        System.out.println(new java.util.Date(1545900468000L));
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Date getLastUpate() {
        return lastUpate;
    }

    public void setLastUpate(Date lastUpate) {
        this.lastUpate = lastUpate;
    }
}
