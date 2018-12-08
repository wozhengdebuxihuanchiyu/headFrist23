package com.yu.create.factory.abstractfactory;



/**
 *
 * 湖南公司，可以生产食物，也可以生产香烟,但是只能生产辣的食物和男式香烟
 */
public class HuNanFactory implements IFactory {
    @Override
    public IFood getFood() {
        System.out.println("湖南公司生产了辣的食物...");
        return new LaFood();
    }

    @Override
    public ISomke getSomke() {
        System.out.println("湖南公司生产了男式香烟...");
        return new ManSomke();
    }
}
