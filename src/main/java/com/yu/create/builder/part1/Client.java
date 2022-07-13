package com.yu.create.builder.part1;


/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * 构建者模式使用
 * 多态构建电脑，这个建造者方式中存在一个问题，构建的时候电脑的属性全部被设置了值，不能动态的设置电脑的属性
 * @author yuchangying
 */
public class Client {

    public static void main(String[] args) {
        //创建建造者流程（算法）
        ComputerDirector computerDirector = new ComputerDirector();
        //建造MAC电脑对象
        ComputerProduct macComputerProduct = computerDirector
                                             .buildComputer(new MacComputerBuilder("英特尔I5", "16G三星内存"));

        System.out.println(macComputerProduct.toString());

        //构建联想电脑对象
        ComputerProduct lenovoComputerProduct = computerDirector
                                                .buildComputer(new LenovoComputerBuilder("AMD CPU", "16G海威内存"));
        System.out.println(lenovoComputerProduct);

    }
}
