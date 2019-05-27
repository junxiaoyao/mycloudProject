package com.jxy.studycloud.lincense.controller;

import com.jxy.studycloud.config.BeanConfig;
import com.jxy.studycloud.lincense.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: jxy
 * @create: 2019-05-27 11:27
 */
@RestController
@RequestMapping("/license")
public class LicenseController {

  @Autowired
  LicenseService service;

  @Autowired
  RestTemplate restTemplate;

  @RequestMapping(value = "/say", method = RequestMethod.GET)
  public String say() {
    return service.say();
  }
}
