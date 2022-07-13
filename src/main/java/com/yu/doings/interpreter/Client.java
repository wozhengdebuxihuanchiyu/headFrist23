package com.yu.doings.interpreter;

/**
 * @author yuchangying
 * @date 2022-06-17 20:38:03
 * 解释器模式：
 * 为了线性的执行某种计算方法，如例子中的，先判断是否包含字符串，再判断是or还是and的关系。
 * 1、抽象表达式
 * 2、终结符表达式
 * 3、非终结符表达式
 * 4、环境
 * 5、客户端
 *
 * 此处为——客户端和环境组合
 */
public class Client {

    /**
     * 规则：输入a 或 b 则返回正确
     * 构建一个or的
     * @return
     */
    public static Expression getAorBExpression(){
        Expression a = new TerminalExpression("a");
        Expression b = new TerminalExpression("b");
        return new OrExpression(a, b);
    }

    /**
     * 规则：输入ab则返回争取
     * 构建一个and的
     */
    public static Expression getAandBExpression(){
        Expression a = new TerminalExpression("a");
        Expression b = new TerminalExpression("b");
        return new AndExpression(a, b);
    }

    public static void main(String[] args) {
        //初始化解析器的计算流程和计算变量
        Expression aorBExpression = getAorBExpression();
        Expression aandBExpression = getAandBExpression();
        //执行解析方法
        System.out.println("输入'a'或'b'则正确，输入是否正确：" + aorBExpression.interpret("a"));
        System.out.println("输入'ab'则正确，输入是否正确：" + aandBExpression.interpret("ab"));
    }

}
