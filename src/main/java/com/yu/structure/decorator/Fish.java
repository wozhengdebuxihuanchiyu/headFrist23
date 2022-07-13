package com.yu.structure.decorator;
/**
 * 装饰器模式
 * 1、抽象构件角色
 * 2、具体构件角色
 * 3、抽象装饰角色
 * 4、具体装饰角色
 * 具体装饰角色——鱼
 * @author yuchangying
 * @date 2022-05-25 16:29:41
 */
public class Fish extends Change{
    /**
     * @param theGreatestSage 具体使用的
     */
    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("鱼儿的业务逻辑");
    }
}
