package com.yu.doings.chain;

/**
 * @author yuchangying
 * @date 2022-06-16 19:18:00
 * 责任链模式：
 * 1、抽象处理者
 * 2、具体处理者
 * 3、客户类
 *
 * 此处为——具体处理者
 */
public class ErrorLogger extends AbstractLogger{
    /**
     * 日志处理级别
     * @param level 级别
     */
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误日志打印:" + message);
    }
}
