package com.xd.pre.modules.sys.service;

import com.xd.pre.modules.sys.domain.SysUserVip;
import com.xd.pre.modules.sys.domain.Sysinformation;

import java.util.List;

public interface ISysInformationService {

   // int addOne(Sysinformation sysinformation);

   // List<Sysinformation> selectByName(String name);

    Sysinformation getByUserId(int id);
}
