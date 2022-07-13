package com.yu.create.builder.part1;

/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * Product：需要创建的目标电脑类
 * @author yuchangying
 */
public class ComputerProduct {

    /**
     * cpu必须属性
     */
    public String cpu;
    /**
     * 内存必须属性
     */
    public String ram;
    /**
     * usb接口数量，非必须
     */
    public String usb;
    /**
     * 键盘，非必须
     */
    public String keyboard;
    /**
     * 鼠标，非必须
     */
    public String display;

    /**
     * 构造器构建必须的属性
     * @param cpu cpu
     * @param ram 内存
     */
    public ComputerProduct(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }
    //不能有必须参数的set方法，因为在构建前必须提供
//    public void setCpu(String cpu) {
//        this.cpu = cpu;
//    }

    public String getRam() {
        return ram;
    }
    //不能有必须参数的set方法，因为在构建前必须提供
//    public void setRam(String ram) {
//        this.ram = ram;
//    }


    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "ComputerProduct{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usb=" + usb +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
