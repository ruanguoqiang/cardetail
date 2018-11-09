package com.rpc.service.imp;

import com.dto.App;
import com.dto.Permission;
import com.genaratexml.AppMapper;
import com.genaratexml.PermissionMapper;
import com.rpc.RpcPermission;
import com.rpc.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionServiceImpl  implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;
    @Resource
    AppMapper appMapper;
    @Override
    public List<Permission> findByAppId(Integer appId, Integer roleId, Boolean isEnable) {
        List<Permission> permissionList=permissionMapper.findPermissionByRole(appId,roleId);
        return permissionList;
    }

    @Override
    public void deletePermission(Integer id, Integer appId) {

    }

    @Override
    public void deleteByAppIds(List<Integer> idList) {

    }

    @Override
    public List<RpcPermission> findListById(String appCode, Integer userId) {
        List<RpcPermission> dbList=permissionMapper.findListById(appCode,userId);
        return dbList;
    }
}
