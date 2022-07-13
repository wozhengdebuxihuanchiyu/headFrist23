package com.yu.doings.memento;

/**
 * @author yuchangying
 * @date 2022-06-18 00:40:12
 * 备忘录模式：
 * 1、发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 2、备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 3、管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * 此处为——发起人
 */
public class Originator {

    /**
     * 月光宝盒前的事情
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 记录一个快照，相当于月光宝盒打开的一瞬间需要返回的时间点
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 回到快照的点，相当于打开月光宝盒穿越了
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
