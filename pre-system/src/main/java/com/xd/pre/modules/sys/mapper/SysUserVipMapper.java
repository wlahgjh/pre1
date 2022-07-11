package com.xd.pre.modules.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xd.pre.modules.sys.domain.SysUserVip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysUserVipMapper extends BaseMapper<SysUserVip> {

    @Select("SELECT * from sys_user_vip")
    List<SysUserVip> listUser();
}
