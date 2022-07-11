package com.xd.pre.modules.sys.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
public class VipDTO {
    private Integer Id;
    private String userName;
    private String code;
    private Date startTime;
    private String counts;
    private String status;
    private String delFlag;


}




