package com.yu.doings.memento;

/**
 * @author yuchangying
 * @date 2022-06-18 00:40:12
 * 备忘录模式：
 * 1、发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 2、备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 3、管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("白晶晶死前10s");
        System.out.println("当前时间点：" + originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        System.out.println("设置了月光宝盒的时间点");


        originator.setState("白晶晶死了");
        System.out.println("当前时间点：" + originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("打开月光宝盒");
        System.out.println("当前时间点：" + originator.getState());



    }

}
