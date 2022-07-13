package com.yu.create.builder.part2;

/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * 动态对构建的对象设置属性值
 * @author yuchangying
 */
public class Client {

    public static void main(String[] args) {

        ComputerProduct computerProduct1 = new ComputerProduct.Builder()
                                                              .cpu("英特尔I7")
                                                              .ram("镁光21G内存")
                                                              .usb("6个usb接口")
                                                              .keyboard("机械键盘")
                                                              .display("雷蛇鼠标")
                                                              .build();
        System.out.println(computerProduct1);

        ComputerProduct computerProduct2 = new ComputerProduct.Builder()
                .cpu("英特尔I7")
                .ram("镁光21G内存")
                .usb("6个usb接口")
                .build();
        System.out.println(computerProduct2);

    }
}
