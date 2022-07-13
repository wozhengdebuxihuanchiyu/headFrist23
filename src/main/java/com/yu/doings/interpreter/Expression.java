package com.yu.doings.interpreter;

/**
 * @author yuchangying
 * @date 2022-06-17 20:38:03
 * 解释器模式：
 * 1、抽象表达式
 * 2、终结符表达式
 * 3、非终结符表达式
 * 4、环境
 * 5、客户端
 *
 * 此处为——抽象表达式
 */
public interface Expression {

    /**
     * 抽象的解释方法
     * @param context 此例子中需要解析的变量
     * @return
     */
    boolean interpret(String context);
}
