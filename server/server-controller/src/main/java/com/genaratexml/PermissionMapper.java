package com.genaratexml;


import java.util.List;

import com.dto.Permission;
import com.dto.PermissionExample;
import com.rpc.RpcPermission;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> findPermissionByRole(@Param("appid") Integer appid,@Param("roleid") Integer roleid);

    List<RpcPermission> findListById(@Param("appCode")String appcode, @Param(("userId")) Integer userid );
}