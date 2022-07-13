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
 * 此处为——concreteCommands,电灯的关操作
 */
public class LightOffCommand implements Command{

    /**
     * 聚合电灯命令的具体操作
     */
    LightReceiver lightReceiver;
    /**
     * 初始化电灯操作的具体执行这
     * @param lightReceiver 电灯命令
     */
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //关灯
        lightReceiver.off();
    }

    @Override
    public void undo() {
        //撤销，即开灯
        lightReceiver.on();
    }
}
