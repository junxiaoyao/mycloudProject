package com.jxy.studycloud.lincense.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: jxy
 * @Date: 2019/5/27 20:55
 * @Description:License实体
 */
@Data
public class License implements Serializable {
    private Long id;
    private String productName;
    private String licenseType;
    private Long orgId;
}
