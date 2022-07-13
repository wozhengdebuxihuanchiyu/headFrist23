package com.yu.doings.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuchangying
 * @date 2022-06-17 23:51:45
 * 中介模式：
 * 1、抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * 2、具体中介者（Concrete Mediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 3、抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 4、具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * 此处为具体中介者,房产中介
 */
public class ConcreteMediator extends Mediator{
    /**
     * 注册过来的同事类
     */
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            //注册进来
            colleagues.add(colleague);
            //设置注册进来的同事类的中介公司
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            //除了当前同事类的全部同事类接收信息
            if(!colleague.equals(colleague1)){
                colleague1.receive();
            }
        }
    }
}
