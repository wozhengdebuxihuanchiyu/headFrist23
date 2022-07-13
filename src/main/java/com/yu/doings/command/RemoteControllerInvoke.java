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
 * 此处为——invoke遥控器，负责对遥控器上的按钮做初始化操作
 */
public class RemoteControllerInvoke {
    /**
     * 开按钮
     */
    Command[] onCommands;
    /**
     * 关按钮
     */
    Command[] offCommands;
    /**
     * 撤销按钮
     */
    Command undoCommand;

    /**
     * 初始化遥控器上的按钮
     */
    public RemoteControllerInvoke() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    /**
     * 设置遥控器的各行功能
     * @param index 遥控器按钮的行数
     * @param onCommand 开按钮
     * @param offCommand 关按钮
     */
    public void setCommands(int index,Command onCommand,Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    /**
     * 遥控器上第几行的开按钮被按下
     * @param index 遥控器上的按钮行数
     */
    public void onButtonWasPushed(int index){
        //第几行的开命令被执行
        onCommands[index].execute();
        //记录开关的位置，用于撤销
        undoCommand = onCommands[index];
    }

    /**
     * 遥控器上第几行的关按钮被按下
     * @param index 遥控器上的按钮行数
     */
    public void offButtonWasPushed(int index){
        //第几行的关命令被执行
        offCommands[index].execute();
        //记录开关的位置，用于撤销
        undoCommand = offCommands[index];
    }

    /**
     * 撤销按钮被按下
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
