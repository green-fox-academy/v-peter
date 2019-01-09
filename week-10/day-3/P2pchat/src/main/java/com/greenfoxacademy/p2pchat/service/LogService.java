package com.greenfoxacademy.p2pchat.service;

import com.greenfoxacademy.p2pchat.model.Log;
import com.greenfoxacademy.p2pchat.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Service
public class LogService {

  LogRepository repo;

  @Autowired
  public void setRepo(LogRepository repo) {
    this.repo = repo;
  }

  @Autowired
  HttpServletRequest request;

  HttpServletResponse response = new MockHttpServletResponse();

  public void log(){
    Log log = new Log(
        getRequestURI(),
        getRequestMethod(),
        getResponseStatus()+"",
        getRequestParameters());
    addLog(log);
    if(getResponseStatus() / 100 == 2) {
      System.out.println(log.getMessage());
    }
    else {
      System.err.println(log.getMessage());
    }
  }

  public void addLog(Log log) {
    this.repo.save(log);
  }

  public String getRequestMethod() {
    return request.getMethod();
  }

  public String getRequestURI() {
    return request.getRequestURI();
  }

  public int getResponseStatus() {
    return response.getStatus();
  }

  public String getRequestParameters() {
    Map<String, String[]> map = request.getParameterMap();
//    String result = new String();
//    for (String key:
//         map.keySet()) {
//      result += key+"="+map.get(key)+" ";
//    }

    //lambda:
    StringBuilder str = new StringBuilder();
    request.getParameterMap().forEach((k, v) -> str.append(k).append("=").append(getValueSet(v)).append(" "));
    return str.toString();
  }

  public String getValueSet(String[] stringArray) {
    String valueSet = new String();
    for (String s :
        stringArray) {
      valueSet += s + " ";
    }
    return valueSet;
  }


}
