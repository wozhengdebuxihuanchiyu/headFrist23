package com.yu.structure.decorator;

/**
 * 装饰器模式
 * 1、抽象构件角色
 * 2、具体构件角色
 * 3、抽象装饰角色
 * 4、具体装饰角色
 * 具体构件角色——猴子
 * @author yuchangying
 * @date 2022-05-25 16:29:41
 */
public class Monkey implements TheGreatestSage{
    @Override
    public void move() {
        System.out.println("猴子变化");
    }
}
