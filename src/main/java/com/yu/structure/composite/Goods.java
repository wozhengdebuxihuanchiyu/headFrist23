package com.yu.structure.composite;
/**
 * 组合模式：
 * 1、抽象构件角色
 * 2、树叶构件角色
 * 3、树枝构件角色
 * 样例为袋子装上生日礼物
 * 此类为树叶构件角色——商品
 * @author yuchangying
 * @date 2022-05-23 17:51:30
 */
public class Goods implements Articles{
    /**
     * 商品名
     */
    private String name;
    /**
     * 单价
     */
    private Float price;
    /**
     * 数量
     */
    private Integer num;

    public Goods(String name, Float price, Integer num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    @Override
    public float calculation() {
        return price * num;
    }

    @Override
    public void show() {
        System.out.println("商品名称：" + name + ",商品单价：" + price + ",商品数量：" + num);
    }
}
