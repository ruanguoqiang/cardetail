package com.rpc;

import com.config.StringUtils;
import com.model.LoginUser;
import com.rpc.service.PermissionJmsService;
import com.rpc.service.PermissionService;
import com.token.TokenManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("authenticationRpcService")
public class AuthenticationRpcServiceImpl implements AuthenticationRpcService
{

    @Resource
    private TokenManager tokenManager;
    @Resource
    PermissionService permissionService;

    @Resource
    PermissionJmsService permissionJmsService;

    @Override
    public boolean validate(String token) {
        return tokenManager.validate(token) != null;
    }

    @Override
    public RpcUser findAuthInfo(String token) {
        LoginUser user = tokenManager.validate(token);
        if (user != null) {
            return new RpcUser(user.getAccount());
        }
        return null;
    }

    @Override
    public List<RpcPermission> findPermissionList(String token, String appCode) {
       if (StringUtils.isBlank(token)){
           return permissionService.findListById(appCode,null);
       }
       else {
          LoginUser loginUser= tokenManager.validate(token);
          if (loginUser!=null){
              return permissionService.findListById(appCode,loginUser.getUserId());
          }
         else {
              return  new  ArrayList<RpcPermission>(0);
          }
       }
    }

    @Override
    public Boolean updatePermission(String ssoCode) {
        permissionJmsService.send(ssoCode);
        return true;
    }
}
