package com.yu.doings.nullobject;

/**
 * @author yuchangying
 * @date 2022-06-18 01:54:13
 * 空对象模式：
 * 1、抽象对象（AbstractObject）：定义所有子类公有的行为和属性。
 * 2、真实对象（RealObject）：继承AbstractObject类，并实现所有行为。
 * 3、空对象（NullObject）：继承AbstractObject类，对父类方法和属性不做实现和赋值。
 */
public class Client {

    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactory();
        factory.getObject("Joe").request();
        factory.getObject("Tom").request();
    }
}
