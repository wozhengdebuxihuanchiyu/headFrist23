package com.yu.create.builder.part2;

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
     */
    private ComputerProduct() {
        throw new RuntimeException("构建失败，构建时ComputerProduct必须已具备必须属性");
    }

    private ComputerProduct(Builder builder) {
        cpu = builder.cpu;
        ram = builder.ram;
        usb = builder.usb;
        keyboard = builder.keyboard;
        display = builder.display;
    }

    @Override
    public String toString() {
        return "ComputerProduct{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usb='" + usb + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    /**
     * 静态内部类
     */
    public static final class Builder{
        private String cpu;
        private String ram;
        private String usb;
        private String keyboard;
        private String display;

        public Builder(){}

        public Builder cpu(String val){
            cpu = val;
            return this;
        }
        public Builder ram(String val){
            ram = val;
            return this;
        }
        public Builder usb(String val){
            usb = val;
            return this;
        }
        public Builder keyboard(String val){
            keyboard = val;
            return this;
        }
        public Builder display(String val){
            display = val;
            return this;
        }

        /**
         * 构建电脑对象
         * @return ComputerProduct
         */
        public ComputerProduct build(){
            return new ComputerProduct(this);
        }
    }

}
