package com.yu.doings.chain;

/**
 * @author yuchangying
 * @date 2022-06-16 19:18:00
 * 责任链模式：
 * 1、抽象处理者
 * 2、具体处理者
 * 3、客户类
 *
 * 此处为——抽象处理者
 */
public abstract class AbstractLogger {

    /**
     * 定义日志处理级别的静态变量
     */
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /**
     * 日志处理级别
     */
    protected int level;

    /**
     * 下一个处理类
     */
    protected AbstractLogger nextLogger;

    /**
     * 设置下一个日志处理类
     * @param abstractLogger 下一个日志处理类
     */
    public void setNextLogger(AbstractLogger abstractLogger){
        this.nextLogger = abstractLogger;
    }

    /**
     * 判断是否是处理类
     * @param level 处理级别
     * @param message 日志信息
     */
    public void logMessage(int level,String message){
        //是当前处理类一个处理的
        //if(this.level <= level)此处写成这样的话，上一个节点需要处理，下一个节点不处理
        if(this.level == level){
            write(message);
        }
        //下一个类处理
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }

    }

    /**
     * 处理日志信息
     * @param message 日志信息
     */
    abstract protected void write(String message);

}
