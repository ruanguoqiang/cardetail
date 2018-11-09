package com.rpc;

import java.util.List;
import java.util.Set;

public class ApplicationPermission {

    private Set<String> applicationPermissionSet=null;

    private List<RpcPermission> applicationMenu=null;

    private static Object monitor=new Object();

    public static void initApplicationPermissions(AuthenticationRpcService authenticationRpcService,
                                                  String ssoAppCode) {
        List<RpcPermission> dList=null;
        dList=authenticationRpcService.findPermissionList(null,ssoAppCode);
    }
}
