package com.yu.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：
 * 1、抽象构件角色
 * 2、树叶构件角色
 * 3、树枝构件角色
 * 样例为袋子装上生日礼物
 * 此类为树枝构件角色——袋子
 * @author yuchangying
 * @date 2022-05-23 17:51:30
 */
public class Bags implements Articles{
    /**
     * 袋子名称
     */
    private String name;
    /**
     * 商品集合
     */
    private List<Articles> sps = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    /**
     * 添加商品
     * @param sp 商品
     */
    public void add(Articles sp){
        sps.add(sp);
    }

    /**
     * 移除商品
     * @param sp 商品
     */
    public void remove(Articles sp){
        sps.remove(sp);
    }

    /**
     * 获取商品
     * @param index 商品未知
     * @return 商品
     */
    public Articles getChild(int index){
        return sps.get(index);
    }

    @Override
    public float calculation() {
        float count = 0.0f;
        for (Articles articles : sps) {
            count += articles.calculation();
        }
        return count;
    }

    @Override
    public void show() {
        for (Articles articles : sps) {
            articles.show();
        }
    }
}
