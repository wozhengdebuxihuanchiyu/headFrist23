package com.yu.structure.bridge;

/**
 * 桥接模式四个要素：
 *      1、抽象类
 *      2、扩充抽象类
 *      3、实现类接口
 *      4、具体实现类
 * 此处为画笔的扩充抽象类-蜡笔
 *
 * @author yuchangying
 * @date 2022-05-23 16:41:57
 */
public class Crayon extends Paint{


    /**
     * 蜡笔使用颜色画画
     */
    @Override
    public void draw() {
        color.bePaint("蜡笔");
    }
}
