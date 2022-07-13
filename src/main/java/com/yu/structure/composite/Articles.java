package com.yu.structure.composite;

/**
 * 组合模式：
 * 1、抽象构件角色
 * 2、树叶构件角色
 * 3、树枝构件角色
 * 样例为袋子装上生日礼物
 * 此类为抽象构件角色——物品
 * @author yuchangying
 * @date 2022-05-23 17:51:30
 */
public interface Articles {

    /**
     *
     * @return 计算物品价格
     */
    float calculation();

    /**
     * 展示物品
     */
    void show();

}
