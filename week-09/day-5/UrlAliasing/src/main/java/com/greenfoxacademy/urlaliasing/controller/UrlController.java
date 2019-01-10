package com.greenfoxacademy.urlaliasing.controller;

import com.greenfoxacademy.urlaliasing.model.Url;
import com.greenfoxacademy.urlaliasing.model.UrlWoSC;
import com.greenfoxacademy.urlaliasing.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UrlController {
    private UrlService service;

    @Autowired
    public void setService(UrlService service) {
        this.service = service;
    }

    @GetMapping(value = {"", "/"})
    public String index(Model model) {
        switch (service.getScenario()) {
            case "default":
                model.addAttribute("message", "Please enter an url (starting with www...) and an alias.");
                break;
            case "success":
                model.addAttribute("message", service.getMessage());
                model.addAttribute("color", service.getColor());
                model.addAttribute("url", "");
                model.addAttribute("alias", "");
                break;
            case "error":
                model.addAttribute("message", service.getMessage());
                model.addAttribute("color", service.getColor());
                model.addAttribute("url", service.getUrl().getUrl());
                model.addAttribute("alias", service.getUrl().getAlias());
                break;
        }
        model.addAttribute("urls", service.getAll());
        return "index";
    }

    @PostMapping(value = "/save-link")
    public String post(@RequestBody MultiValueMap<String, String> formData) {
        service.setUrl(formData.toSingleValueMap().get("url"), formData.toSingleValueMap().get("alias"));
        service.checkValidity();
        return "redirect: ";
    }

    @GetMapping(value = "/a")
    public Object link(@RequestParam String alias, HttpServletResponse httpServletResponse) throws IOException {
        if (service.getRepository().findByAlias(alias) != null) {
            //httpServletResponse.sendRedirect("http://" + service.getRepository().findByAlias(alias).getUrl());
            return "redirect:http://"+service.getRepository().findByAlias(alias).getUrl();
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
            //httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    @GetMapping("/api/links")
    @ResponseBody
    public ResponseEntity<Url> getAllRest(){
        return new ResponseEntity(this.service.getAll(), HttpStatus.OK);
    }

}
