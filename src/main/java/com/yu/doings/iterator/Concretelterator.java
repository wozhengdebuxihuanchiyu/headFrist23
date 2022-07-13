package com.yu.doings.iterator;

import java.util.List;

/**
 * @author yuchangying
 * @date 2022-06-17 23:22:02
 * 迭代器模式：
 * 1、抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * 2、具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * 3、抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * 4、具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置
 *
 * 此处为具体迭代器角色
 */
public class Concretelterator implements Iterator {

    /**
     * 存储工具
     */
    private List elements = null;

    private int index = -1;

    public Concretelterator(List elements) {
        this.elements = elements;
    }

    @Override
    public Object first() {
        index = 0;
        return elements.get(index);
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return elements.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(index < elements.size() - 1){
            return true;
        }
        return false;
    }
}
