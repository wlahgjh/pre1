package com.xd.pre.modules.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.pre.modules.sys.domain.SysUserVip;
import com.xd.pre.modules.sys.mapper.SysUserVipMapper;
import com.xd.pre.modules.sys.service.SysUserVipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserVipImpl extends ServiceImpl<SysUserVipMapper,SysUserVip> implements SysUserVipService {


    @Override
    public int addOne(SysUserVip sysVip) {
        SysUserVip newOne = new SysUserVip();
        BeanUtil.copyProperties(sysVip,newOne);
        newOne.setDelFlag("0");
        return baseMapper.insert(newOne);
    }

    @Override
    public List<SysUserVip> selectByName(String username) {
        QueryWrapper<SysUserVip> wrapper = new QueryWrapper<>();
        wrapper.like("user_name",username);
       // List<SysUserVip> list =baseMapper.selectList(wrapper);
        return baseMapper.selectList(wrapper);
    }

}
