package com.greenfoxacademy.urlaliasing.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties( { "secretCode" })
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url;
    private String alias;
    private int hitCount;
    private int secretCode;

    public Url() {
    }

    public Url(String url, String alias) {
        this.url = url;
        this.alias = alias;
        this.hitCount = 0;
        this.secretCode = (int) (Math.random() * 9000 + 1000);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }
}
