package com.xd.pre.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@TableName("sys_user_vip")
@NoArgsConstructor
public class SysUserVip {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userName;

    private String code;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    private String counts;

    private String status;

    @TableLogic(value = "0")
    private String delFlag;

    private Date createTime;

    private  Date updateTime;

    private Integer informationId;

}
