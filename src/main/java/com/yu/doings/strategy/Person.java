package com.yu.doings.strategy;

/**
 * @author yuchangying
 * @date 2022-06-18 02:09:12
 * 策略模式：
 * 1、抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 2、具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 3、环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * 此处为环境，人可以选择多种出行方式
 * 将出行的接口组合进人的对象里，人就可以随意的选择出行方式，只要这个出行方式是出行接口的实现类
 */
public class Person {

    /**
     * 组合使用策略
     */
    private StrategyTranvel tranvel;

    /**
     * 构造器初始化出行方式策略
     * @param tranvel 出行方式策略
     */
    public Person(StrategyTranvel tranvel){
        this.tranvel = tranvel;
    }

    /**
     * 出行
     */
    public void tranvel(){
        tranvel.tranvel();
    }
}
