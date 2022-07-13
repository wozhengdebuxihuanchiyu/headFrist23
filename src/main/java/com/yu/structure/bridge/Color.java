package com.yu.structure.bridge;

/**
 * 桥接模式四个要素：
 *      1、抽象类
 *      2、扩充抽象类
 *      3、实现类接口
 *      4、具体实现类
 * 此处为颜色的实现类接口
 *
 * @author yuchangying
 * @date 2022-05-23 16:41:57
 */
public interface Color {

    /**
     *
     * @param paintName 画笔名字
     */
    void bePaint(String paintName);
}
