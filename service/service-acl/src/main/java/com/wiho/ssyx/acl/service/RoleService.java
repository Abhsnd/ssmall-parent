package com.wiho.ssyx.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wiho.ssyx.model.acl.Role;
import com.wiho.ssyx.vo.acl.RoleQueryVo;

public interface RoleService extends IService<Role> {
    // 获取角色分页列表
    IPage<Role> selectPage(Page<Role> pageParam, RoleQueryVo roleQueryVo);
}
