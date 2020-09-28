package com.itheima.aspect;

import org.springframework.stereotype.Component;

/**
 * 包名:com.itheima.aspect
 *
 * @author Leevi
 * 日期2020-09-28  09:56
 */
@Component
public class PermissionAspect {

    public void checkPermission(){
        System.out.println("校验权限....");
    }
}
