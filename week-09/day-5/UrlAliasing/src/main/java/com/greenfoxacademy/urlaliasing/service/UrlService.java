package com.greenfoxacademy.urlaliasing.service;

import com.greenfoxacademy.urlaliasing.model.Url;

import com.greenfoxacademy.urlaliasing.repository.UrlCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlService {
    private UrlCRUDRepository repository;
    private String message;
    private String color;
    private Url url;
    //private UrlWoSC urlWoSC;
    private String scenario;

    public UrlService() {
        this.scenario = "default";
    }

    @Autowired
    public void setRepository(UrlCRUDRepository repo) {
        this.repository = repo;
    }

    public String getScenario() {
        return this.scenario;
    }

    public String getMessage() {
        return message;
    }

    public String getColor() {
        return color;
    }

    public void setErrorMessage() {
        setColor("red");
        this.message = "Your alias is already in use!";
    }

    public void setSuccessMessage() {
        setColor("black");
        this.message = "Your URL is aliased to " + url.getAlias() + " and your secret code is " + url.getSecretCode() + ".";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setUrl(String url, String alias) {
        this.url = new Url(url, alias);
    }

    public void checkValidity() {
        if (repository.findByAlias(url.getAlias()) == null) {
            repository.save(url);
            this.scenario = "success";
            setSuccessMessage();
        } else {
            this.scenario = "error";
            setErrorMessage();
        }
    }

    public Url getUrl() {
        return url;
    }

    public List<Url> getAll () {
        Iterable<Url> all = this.repository.findAll();
        List<Url> result = new ArrayList<>();
        all.forEach(result::add);
        return result;
    }

//    public List<UrlWoSC> getAllWoSCode () {
//        Iterable<Url> all = this.repository.findAll();
//        List<UrlWoSC> result = new ArrayList<>();
//        for (Url url :
//            all) {
//            result.add(new UrlWoSC(url.getUrl(),url.getAlias(),url.getHitCount()));
//        }
//        return result;
//    }

    public UrlCRUDRepository getRepository() {
        return repository;
    }
}
