package com.yu.doings.state;

/**
 * @author yuchangying
 * @date 2022-06-18 01:21:41
 * 状态模式：
 * 1、环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 * 2、抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 * 3、具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 */
public class Client {

    public static void main(String[] args) {
        ContextScore contextScore = new ContextScore();
        contextScore.add(30);
        contextScore.add(30);
        contextScore.add(20);
        contextScore.add(20);
        contextScore.add(-10);
        contextScore.add(-30);
    }

}
