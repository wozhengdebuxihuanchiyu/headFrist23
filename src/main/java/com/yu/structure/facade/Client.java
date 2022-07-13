package com.yu.structure.facade;

/**
 * 外观模式
 * 1、外观角色
 * 2、子系统角色
 * 3、客户角色
 *
 * 客户角色
 * @author yuchangying
 * @date 2022-05-25 16:59:04
 */
public class Client {

    public static void main(String[] args) {
        BuyService buyService = new BuyService();
        buyService.service();
    }
}
