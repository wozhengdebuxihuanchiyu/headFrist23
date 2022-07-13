package com.yu.create.builder.part1;


/**
 * 建造者模式：详见附件《设计模式知识图谱.emmx》
 * ConcreateBuilder:创建者抽象的实现,建造联想电脑
 * @author yuchangying
 */
public class LenovoComputerBuilder extends AbstractComputerBuilder{

    private ComputerProduct computerProduct;

    public LenovoComputerBuilder() {
        throw new RuntimeException("构建失败，构建时ComputerProduct必须已具备必须属性");
    }

    public LenovoComputerBuilder(String cpu,String ram) {
        computerProduct = new ComputerProduct(cpu,ram);
    }

    @Override
    public void setUsb() {
        computerProduct.setUsb("联想电脑4个USB接口");
    }

    @Override
    public void setKeyboard() {
        computerProduct.setKeyboard("联想电脑使用联想键盘");
    }

    @Override
    public void setDisplay() {
        computerProduct.setDisplay("联想电脑使用联想鼠标");
    }

    @Override
    public ComputerProduct getComputerProduct() {
        return computerProduct;
    }
}
