package com.yu.structure.flyweight;

import java.util.HashMap;

/**
 * 享元模式
 * 1、抽象的享元角色
 * 2、具体的享元角色
 * 3、不可共享的角色
 * 4、享元工厂类
 *
 * 享元工厂
 * @author yuchangying
 * @date 2022-05-25 17:23:04
 */
public class WebSiteFactory {

    /**
     * 缓存池子
     */
    private HashMap<String,WebSite> pool = new HashMap<>();


    public WebSite getWebSiteCategory(String type){
        //如果缓存池不存在，则添加
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        //存在直接返回
        return pool.get(type);
    }
}
