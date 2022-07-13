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
 * 此处为——终结符表达式
 */
public class TerminalExpression implements Expression{

    /**
     * 存储变量的值
     */
    private String data;

    /**
     * 初始化存储变量
     * @param data 初始化变量的值
     */
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        //具体的解析方式，初始化的变量值是否包含出入的值
        //此处可以写多种解析方式，如：加减乘除
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
