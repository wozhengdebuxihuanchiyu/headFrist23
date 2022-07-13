package com.yu.structure.flyweight;

/**
 * 享元模式
 * 1、抽象的享元角色
 * 2、具体的享元角色
 * 3、不可共享的角色
 * 4、享元工厂类
 *
 * 具体的享元角色
 * @author yuchangying
 * @date 2022-05-25 17:23:04
 */
public class ConcreteWebSite extends WebSite{

    /**
     * 网站的发布形式
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}
