package com.xd.pre.modules.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.pre.modules.sys.domain.SysUserVip;
import com.xd.pre.modules.sys.domain.Sysinformation;
import com.xd.pre.modules.sys.mapper.SysInformationMapper;
import com.xd.pre.modules.sys.mapper.SysUserVipMapper;
import com.xd.pre.modules.sys.service.ISysInformationService;
import com.xd.pre.modules.sys.service.SysUserVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysInformationImpl implements ISysInformationService {

    @Autowired
    private SysInformationMapper sysInformationMapper;

    @Override
    public Sysinformation getByUserId(int id) {
       // QueryWrapper<Sysinformation> wrapper = new QueryWrapper<>();
       sysInformationMapper.selectById(id);
        return sysInformationMapper.selectById(id);
    }
}
