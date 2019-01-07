package com.greenfoxacademy.urlaliasing.repository;

import com.greenfoxacademy.urlaliasing.model.Url;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UrlCRUDRepository extends CrudRepository<Url, Long> {
    Url findByAlias(String alias);
}
