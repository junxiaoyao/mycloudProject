package com.jxy.studycloud.lincense.controller;

import com.jxy.studycloud.lincense.entity.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Auther: jxy
 * @Date: 2019/5/27 20:52
 * @Description:license控制器
 */
@RestController
@RequestMapping(value = "license/organizations/{organizationId}/license")
public class LicenseController {
    @RequestMapping(value = "/{licenseId}")
    public License getLicense(@PathVariable("organizationId") Long organizationId, @PathVariable("licenseId") Long licenseId) {
        License license = new License();
        license.setId(new Random().nextLong());
        license.setId(licenseId);
        license.setOrgId(organizationId);
        license.setProductName("人事部");
        return license;
    }
}
