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
 * 此处为——非终结符表达式1
 */
public class AndExpression implements Expression {

    /**
     * 前一个值，此处例子总共用了两个值
     */
    private Expression expr1 = null;
    /**
     * 后一个值，此处例子总共用了两个值
     */
    private Expression expr2 = null;

    /**
     * 初始化解析器
     * @param expr1 需要具体解析的前一个值
     * @param expr2 需要具体解析的后一个值
     */
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        //并且的比较方式
        //此处被调用了两层，TerminalExpression.interpret()终结解释器也被调用了
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
