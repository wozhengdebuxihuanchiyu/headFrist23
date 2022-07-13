package com.yu.structure.facade;

/**
 * 外观模式
 * 1、外观角色
 * 2、子系统角色
 * 3、客户角色
 *
 * 子系统角色——支付
 * @author yuchangying
 * @date 2022-05-25 16:59:04
 */
public class PayService {

    public void service(){
        System.out.println("执行【支付】业务逻辑");
    }
}
