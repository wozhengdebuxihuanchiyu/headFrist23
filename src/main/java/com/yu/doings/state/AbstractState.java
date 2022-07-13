package com.yu.doings.state;
/**
 * @author yuchangying
 * @date 2022-06-18 01:21:41
 * 状态模式：
 * 1、环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 * 2、抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 * 3、具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 *
 * 此处为抽象状态
 */
public abstract class AbstractState {
    /**
     * 环境类
     */
    protected ContextScore contextScore;
    /**
     * 分数
     */
    protected int score;
    /**
     * 分数对应的等级
     */
    protected String stateName;

    /**
     * 检查当前的分数等级
     */
    public abstract void checkState();

    /**
     * 分数累加
     * @param x 分数
     */
    public void add(int x){
        score += x;
        System.out.println("加上" + x +"分，当前分数：" + score);
        checkState();
        System.out.println("当前状态为：" + contextScore.getAbstractState().stateName);
    }
}
