package com.yu.structure.decorator;

import java.util.ArrayList;

/**
 * 装饰器模式
 * 1、抽象构件角色
 * 2、具体构件角色
 * 3、抽象装饰角色
 * 4、具体装饰角色
 * @author yuchangying
 * @date 2022-05-25 16:29:41
 */
public class Client {

    public static void main(String[] args) {
        //第一种写法
        TheGreatestSage theGreatestSage = new Monkey();
        TheGreatestSage fish = new Fish(theGreatestSage);
        fish.move();

        //第二种写法
        TheGreatestSage bird = new Fish(new Bird(theGreatestSage));
        bird.move();

    }
}
