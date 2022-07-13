package com.yu.doings.command;

/**
 * @author yuchangying
 * @date 2022-06-17 16:40:26
 * 命令模式：
 * 1、command:命令接口
 * 2、concreteCommands:会实现各种类型的请求。 具体命令自身并不完成工作， 而是会将调用委派给一个业务逻辑对象。
 * 3、Invoke:负责对请求进行初始化， 其中必须包含一个成员变量来存储对于命令对象的引用。
 * 4、receiver:接收者,完成实际的工作
 * 5、client:客户端
 *
 * 此处为——命令接口
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
