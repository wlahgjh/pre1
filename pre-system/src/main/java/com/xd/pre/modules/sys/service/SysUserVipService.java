package com.xd.pre.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.pre.common.utils.R;
import com.xd.pre.modules.sys.domain.SysUserVip;

import java.io.Serializable;
import java.util.List;

public interface SysUserVipService extends IService<SysUserVip> {

    /**
     * 新增
     * @return
     */
    int addOne(SysUserVip sysVip);

    List<SysUserVip> selectByName(String username);
}
