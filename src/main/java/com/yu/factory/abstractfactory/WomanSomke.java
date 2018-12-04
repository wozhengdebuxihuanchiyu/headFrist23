package com.yu.factory.abstractfactory;

/**
 * 女士香烟
 */
public class WomanSomke implements ISomke {
    @Override
    public void somking() {
        System.out.println("抽了女士香烟..");
    }
}
