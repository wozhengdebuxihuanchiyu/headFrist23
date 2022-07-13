package com.yu.create.builder.part1;

/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * ConcreateBuilder:创建者抽象的实现，建造MAC电脑
 * @author yuchangying
 */
public class MacComputerBuilder extends AbstractComputerBuilder{

    private ComputerProduct computerProduct;

    public MacComputerBuilder() {
        throw new RuntimeException("构建失败，构建时ComputerProduct必须已具备必须属性");
    }

    /**
     * 构造器默认创建Computer的必须属性
     * @param cpu cpu
     * @param ram 内存
     */
    public MacComputerBuilder(String cpu,String ram) {
        computerProduct = new ComputerProduct(cpu,ram);
    }

    @Override
    public void setUsb() {
        computerProduct.setUsb("mac没有usb接口");
    }

    @Override
    public void setKeyboard() {
        computerProduct.setKeyboard("mac使用蝴蝶键盘");
    }

    @Override
    public void setDisplay() {
        computerProduct.setDisplay("mac没有鼠标");
    }

    @Override
    public ComputerProduct getComputerProduct(){
        return computerProduct;
    }
}
