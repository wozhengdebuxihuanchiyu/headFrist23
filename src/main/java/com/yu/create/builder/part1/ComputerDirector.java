package com.yu.create.builder.part1;

/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * Director：构建Computer的流程（算法）
 * @author yuchangying
 */
public class ComputerDirector {

    /**
     * 构建电脑的非必须属性
     * @param abstractComputerBuilder 创建者的抽象
     */
    public ComputerProduct buildComputer(AbstractComputerBuilder abstractComputerBuilder){
        /**
         * 在这里控制构建的东西
         */
        //构建usb接口
        abstractComputerBuilder.setUsb();
        //构建键盘
        abstractComputerBuilder.setKeyboard();
        //构建鼠标
        abstractComputerBuilder.setDisplay();
        //返回构建好的电脑
        return abstractComputerBuilder.getComputerProduct();
    }

}
