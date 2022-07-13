package com.yu.create.builder.part1;


/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * Builder:创建者的抽象
 * @author yuchangying
 */
public abstract class AbstractComputerBuilder {


    /**
     * 构建电脑的USB接口数量
     */
    public abstract void setUsb();

    /**
     * 构建电脑的键盘
     */
    public abstract void setKeyboard();

    /**
     * 构建电脑的鼠标
     */
    public abstract void setDisplay();

    /**
     * 获取构建好的电脑
     */
    public abstract ComputerProduct getComputerProduct();
}
