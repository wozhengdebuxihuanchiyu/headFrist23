package com.yu.structure.facade;
/**
 * 外观模式
 * 1、外观角色
 * 2、子系统角色
 * 3、客户角色
 *
 * 外观角色
 * @author yuchangying
 * @date 2022-05-25 16:59:04
 */
public class BuyService {

    /**
     * 订单执行service
     */
    private OrderService orderService = new OrderService();

    /**
     * 支付执行service
     */
    private PayService payService = new PayService();

    /**
     * 服务集合
     */
    public void service(){
       orderService.service();
       payService.service();
    }
}
