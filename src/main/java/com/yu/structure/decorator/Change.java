package com.yu.structure.decorator;

/**
 * 装饰器模式
 * 1、抽象构件角色
 * 2、具体构件角色
 * 3、抽象装饰角色
 * 4、具体装饰角色
 * 抽象装饰角色——变化
 * @author yuchangying
 * @date 2022-05-25 16:29:41
 */
public class Change implements TheGreatestSage{

    /**
     *
     */
    private TheGreatestSage theGreatestSage;

    /**
     *
     * @param theGreatestSage 具体使用的
     */
    public Change(TheGreatestSage theGreatestSage) {
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public void move() {
        this.theGreatestSage.move();
    }
}
