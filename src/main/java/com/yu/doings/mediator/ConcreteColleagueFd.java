package com.yu.doings.mediator;

/**
 * @author yuchangying
 * @date 2022-06-17 23:51:45
 * 中介模式：
 * 1、抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * 2、具体中介者（Concrete Mediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 3、抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 4、具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * 此处为具体同事类,房东
 */
public class ConcreteColleagueFd extends Colleague{
    @Override
    public void receive() {
        System.out.println("房东：收到信息");
    }

    @Override
    public void send() {
        System.out.println("三室两厅，一个月3000元");
        mediator.relay(this);
    }
}
