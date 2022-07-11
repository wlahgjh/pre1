package com.xd.pre.modules.sys.controller;

import com.xd.pre.common.utils.R;
import com.xd.pre.modules.sys.service.ISysInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/information")
public class SysinformationController {

    @Autowired
    private ISysInformationService sysInformationService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('sys:user:infomation')")
    public R getInfomation(@PathVariable("id")int id){
        return R.ok(sysInformationService.getByUserId(id));
    }

}
