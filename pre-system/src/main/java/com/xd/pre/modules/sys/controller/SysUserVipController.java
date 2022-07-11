package com.xd.pre.modules.sys.controller;

import com.xd.pre.common.utils.R;
import com.xd.pre.log.annotation.SysOperaLog;
import com.xd.pre.modules.sys.domain.SysTenant;
import com.xd.pre.modules.sys.domain.SysUserVip;
import com.xd.pre.modules.sys.service.SysUserVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vip")
public class SysUserVipController {

    @Autowired
    private SysUserVipService sysUserVipService;
// 查询会员信息
    @GetMapping
    @PreAuthorize("hasAuthority('sys:vip:view')")
    public R list(String username) {
        if(username != "" || username != null)
        {
            return  R.ok(sysUserVipService.selectByName(username));
        }

        return R.ok(sysUserVipService.list());
    }

    // 增
    @SysOperaLog(descrption = "增添新会员")
    @PostMapping
    @PreAuthorize("hasAuthority('sys:vip:add')")
    public R list(@RequestBody SysUserVip sysVip) {
        return R.ok(sysUserVipService.addOne(sysVip));
    }
     //删
    @SysOperaLog(descrption = "删除会员")
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('sys:vip:del')")
    public R removeById(@PathVariable("id")  Integer id) {
        return R.ok(sysUserVipService.removeById(id));
    }


    //改
    @SysOperaLog(descrption = "会员修改")
    @PutMapping
    @PreAuthorize("hasAuthority('sys:vip:update')")
    public R updateById(@RequestBody SysUserVip sysVip) {
        return R.ok(sysUserVipService.updateById(sysVip));
    }

//    @GetMapping("/search")
//    @PreAuthorize("hasAuthority('sys:vip:update')")
//    public R updateById(String username) {
//        return R.ok(sysUserVipService.updateById(sysVip));
//    }




}


