package com.yu.doings.chain;

/**
 * @author yuchangying
 * @date 2022-06-16 19:18:00
 * 责任链模式：使用处理链条，让处理的流程线性无交叉
 * 1、抽象处理者
 * 2、具体处理者
 * 3、客户类
 *
 * 此处为——客户类
 */
public class Client {

    /**
     * 初始化责任链
     * @return 处理链
     */
    public static AbstractLogger getChainLogger(){
        //初始化链条中的节点
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);
        //设置处理联调顺序
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        //返回链条
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainLogger = Client.getChainLogger();

        //chainLogger.logMessage(AbstractLogger.ERROR,"错误日志信息");

        //chainLogger.logMessage(AbstractLogger.DEBUG,"DEBUG日志信息");

        chainLogger.logMessage(AbstractLogger.INFO,"INFO日志信息");
    }
}
