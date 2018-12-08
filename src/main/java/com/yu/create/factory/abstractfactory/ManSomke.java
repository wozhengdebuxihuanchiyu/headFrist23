package com.yu.create.factory.abstractfactory;

/**
 * 男式香烟
 */
public class ManSomke implements ISomke{
    @Override
    public void somking() {
        System.out.println("抽了男式香烟...");
    }
}
